<?xml version="1.0" encoding="windows-1251"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:My="localhost"
	xmlns:msxsl="urn:schemas-microsoft-com:xslt"
	exclude-result-prefixes="My msxsl">

<xsl:output encoding="utf-8" omit-xml-declaration="yes" indent="yes" method="text" />

<!--==============================================-->
<xsl:template match="/" name="tmpMain">
	//GENERATED <xsl:value-of select="My:Now()" />
	package app;

	import models.*;

public class Linkistry_Fill
{
	public static void justDoIt()
	{
	if (Linkistry.hasContent())
	return;

	Link item;

	<xsl:apply-templates select="//Link">
		<xsl:sort select="parent::*/@Class" />
	</xsl:apply-templates>
	}//function
}//class
//GENERATED <xsl:value-of select="My:Now()" />
</xsl:template>
<!--==============================================-->

<!--==========================================-->
<xsl:template match="Link">
	<xsl:variable name="Class" select="parent::*/@Class" />
	<xsl:variable name="Ident" select="parent::*/@Name" />
	item = new Link();
	item.Child = <xsl:value-of select="$Class" />.takeIdent();
	item.Name = "<xsl:value-of select="@Name" />";
	<xsl:if test="string-length(@Master) != 0">item.Master = <xsl:value-of select="@Master"/>.takeIdent();</xsl:if>
	<xsl:if test="string-length(@Label) != 0">item.Label = "<xsl:value-of select="@Label" />";</xsl:if>
	<xsl:if test="string-length(@Description) != 0">item.Description = "<xsl:value-of select="@Description" />";</xsl:if>
	Linkistry.add(item);
</xsl:template>
<!--==========================================-->

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