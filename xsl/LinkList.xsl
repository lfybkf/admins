<?xml version="1.0" encoding="windows-1251"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
xmlns:My="localhost" 
xmlns:msxsl="urn:schemas-microsoft-com:xslt"
exclude-result-prefixes="My msxsl">

<xsl:output encoding="utf-8" omit-xml-declaration="yes" indent="yes" method="text" />
<xsl:variable name="Schema" select="//Schema/@Name" />

<!--==============================================-->
<xsl:template match="/" name="tmpMain">
	//GENERATED <xsl:value-of select="My:Now()" />
	package app;

	import java.util.*;
	import java.text.*;
	import models.*;
	import com.avaje.ebean.*;

public class Link_List
{

	public static List&lt;? extends IEntity&gt; get(Link link)
	{
Long master_id = link.master_id;
String Child = link.Child;
String Name = link.Name;
if (false)
	;
<xsl:apply-templates select="//Entity[@Class]" mode="list">
	<xsl:sort select="@Class" />
</xsl:apply-templates>

	return null;
	}//method
	}//class
//GENERATED <xsl:value-of select="My:Now()" />
</xsl:template>
<!--==============================================-->

	<!--==============================================-->
	<xsl:template match="Entity" mode="list">
//=========<xsl:value-of select="@Class"/> BEGIN
else if (Child.equals(<xsl:value-of select="@Class"/>.takeIdent()))
{
List&lt;<xsl:value-of select="@Class"/>&gt; Ret = null;
if (false)
	;
<xsl:apply-templates select="Link" mode="list">
	<xsl:sort select="@Name"/>
</xsl:apply-templates>
return Ret;
}//if
//=========<xsl:value-of select="@Class"/> END
	</xsl:template>
	<!--==============================================-->

	<!--==========================================-->
	<xsl:template match="Link" mode="list">
else if (Name.equals("<xsl:value-of select="@Name"/>"))
{
	<xsl:choose>
		<xsl:when test="List[@Way='SimpleMaster'] ">
			<xsl:apply-templates select="List" mode="SimpleMaster" />
		</xsl:when>
		<xsl:when test="List[@Way='All'] ">
			<xsl:apply-templates select="List" mode="All" />
		</xsl:when>
		<xsl:when test="List[@Way='Sql'] ">
			<xsl:apply-templates select="List" mode="Sql" />
		</xsl:when>
	</xsl:choose>
}//if
	</xsl:template>
	<!--==========================================-->

	<!--==========================================-->
	<xsl:template match="List" mode="SimpleMaster">
		<xsl:variable name="Class" select="ancestor::Entity/@Class" />
		<xsl:variable name="Fetch">
			<xsl:for-each select="ancestor::Entity/F[contains(@Name, '_id')]">.fetch("<xsl:value-of select="@Name"/>")</xsl:for-each>
		</xsl:variable>
Query&lt;<xsl:value-of select="$Class" />&gt; query = Finder.DB.find(<xsl:value-of select="$Class" />.class)<xsl:value-of select="$Fetch" />
	.where().eq("<xsl:value-of select="@MasterField"/>", master_id )
		.orderBy("<xsl:value-of select="@OrderBy"/>");
Ret = query.findList();
	</xsl:template>
	<!--==========================================-->

	<!--==========================================-->
	<xsl:template match="List" mode="All">
		<xsl:variable name="Class" select="ancestor::Entity/@Class" />
		<xsl:variable name="Fetch">
			<xsl:for-each select="ancestor::Entity/F[contains(@Name, '_id')]">.fetch("<xsl:value-of select="@Name"/>")</xsl:for-each>
		</xsl:variable>
Query&lt;<xsl:value-of select="$Class" />&gt; query = Finder.DB.find(<xsl:value-of select="$Class" />.class)<xsl:value-of select="$Fetch" />
		.orderBy("<xsl:value-of select="@OrderBy"/>");
Ret = query.findList();
	</xsl:template>
	<!--==========================================-->


	<!--==========================================-->
	<xsl:template match="List" mode="Sql">
		<xsl:variable name="Class" select="ancestor::Entity/@Class" />
		<xsl:variable name="Fetch">
			<xsl:for-each select="ancestor::Entity/F[contains(@Name, '_id')]">.fetch("<xsl:value-of select="@Name"/>", new FetchConfig().query())</xsl:for-each>
		</xsl:variable>
String prefix = "z.";
String sql = MessageFormat.format("SELECT {0} <xsl:value-of select="."/> ", Utils.DbFields(<xsl:value-of select="$Class" />.DbE, prefix, ", "));
RawSqlBuilder rsb = RawSqlBuilder.parse(sql);
rsb = Utils.MapColumns(<xsl:value-of select="$Class" />.DbE, rsb, prefix);
RawSql rawSql = rsb.create();
Query&lt;<xsl:value-of select="$Class" />&gt; query = Finder.DB.find(<xsl:value-of select="$Class" />.class)<xsl:value-of select="$Fetch" />.setRawSql(rawSql);
query.setParameter("master_id", master_id);
Ret = query.findList();
	//Logger.info(sql);
	</xsl:template>
	<!--==========================================-->





	<!-- recycle bin
	name="{My:IfId(string(@Name), string($FullId))}"

	============-->

<msxsl:script language="VBScript" implements-prefix="My">
<![CDATA[ 
function Now()
	Now = FormatDateTime(Date()) & " " & FormatDateTime(Time())
end function

function ReplClass(aWhere, aByWhat)
  ReplClass = Replace(aWhere, "#CLASS#", aByWhat)
end function

function IfYes(aWhat, aDefault)
	If Len(aWhat) > 0 Then
		Ret = aWhat
	Else
		Ret = aDefault
	End If
	IfYes = Ret
end function

]]> 
</msxsl:script> 
</xsl:stylesheet>