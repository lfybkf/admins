<?xml version="1.0" encoding="windows-1251"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
xmlns:My="localhost" 
xmlns:msxsl="urn:schemas-microsoft-com:xslt"
exclude-result-prefixes="My msxsl">

<xsl:output encoding="utf-8" omit-xml-declaration="yes" indent="yes" method="text" />

<!--==============================================-->
<xsl:template match="/" name="tmpMain">
	//GENERATED <xsl:value-of select="My:Now()" />

	package app;

	import models.*;
	import java.util.Comparator;

public class Link_Order
{
	public static Comparator<![CDATA[<IEntity>]]> takeComparator(String ident, String order)
	{
		if (false)
			;
	<xsl:for-each select="//Entity[@Class]">
		<xsl:sort select="@Class"/>
		else if (ident.equals(<xsl:value-of select="@Class"/>.takeIdent()))
		{
			<xsl:for-each select="F">
			if (order.equals("<xsl:value-of select="@Name"/>"))
			{
			return new Comparator<![CDATA[<IEntity>]]>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof <xsl:value-of select="parent::Entity/@Class" /> == false)
						return 0;
					if (obj2 instanceof <xsl:value-of select="parent::Entity/@Class" /> == false)
						return 0;
					
					<xsl:value-of select="parent::Entity/@Class" /> ent1 = (<xsl:value-of select="parent::Entity/@Class" />)obj1;
					<xsl:value-of select="parent::Entity/@Class" /> ent2 = (<xsl:value-of select="parent::Entity/@Class" />)obj2;

					<xsl:choose>
					<xsl:when test="contains(@Name, '_id')">
					String s1 = ent1.<xsl:value-of select="My:Getter(string(@Name))" />.toString();
					String s2 = ent2.<xsl:value-of select="My:Getter(string(@Name))" />.toString();
					return s1.compareToIgnoreCase(s2);
					</xsl:when>
					<xsl:when test="contains(@Type, 'char') or contains(@Type, 'text')">
					String s1 = ent1.<xsl:value-of select="My:Getter(string(@Name))" />;
					String s2 = ent2.<xsl:value-of select="My:Getter(string(@Name))" />;
					return s1.compareToIgnoreCase(s2);
					</xsl:when>
					<xsl:when test="contains(@Type, 'int') or contains(@Type, 'serial')">
					Long v1 = new Long(ent1.<xsl:value-of select="My:Getter(string(@Name))" />);
					Long v2 = new Long(ent2.<xsl:value-of select="My:Getter(string(@Name))" />);
					return v1.compareTo(v2);
					</xsl:when>
					<xsl:when test="contains(@Type, 'boolean')">
					Boolean v1 = new Boolean(ent1.<xsl:value-of select="My:Getter(string(@Name))" />);
					Boolean v2 = new Boolean(ent2.<xsl:value-of select="My:Getter(string(@Name))" />);
					return v1.compareTo(v2);
					</xsl:when>
					<xsl:otherwise>
					return 0;	
					</xsl:otherwise>
					</xsl:choose>
					
				}
			};
			}//if
			</xsl:for-each>
		}//if
	</xsl:for-each>
		return null;
	}//function


	public static Comparator<![CDATA[<IEntity>]]> takeComparatorBack(String ident, String order)
	{
		if (false)
			;
	<xsl:for-each select="//Entity[@Class]">
		<xsl:sort select="@Class"/>
		else if (ident.equals(<xsl:value-of select="@Class"/>.takeIdent()))
		{
			<xsl:for-each select="F">
			if (order.equals("<xsl:value-of select="@Name"/>"))
			{
			return new Comparator<![CDATA[<IEntity>]]>()
			{
				@Override
				public int compare(IEntity obj1, IEntity obj2) 
				{
					if (obj1 instanceof <xsl:value-of select="parent::Entity/@Class" /> == false)
						return 0;
					if (obj2 instanceof <xsl:value-of select="parent::Entity/@Class" /> == false)
						return 0;
					
					<xsl:value-of select="parent::Entity/@Class" /> ent1 = (<xsl:value-of select="parent::Entity/@Class" />)obj1;
					<xsl:value-of select="parent::Entity/@Class" /> ent2 = (<xsl:value-of select="parent::Entity/@Class" />)obj2;

					<xsl:choose>
					<xsl:when test="contains(@Name, '_id')">
					String s1 = ent1.<xsl:value-of select="My:Getter(string(@Name))" />.toString();
					String s2 = ent2.<xsl:value-of select="My:Getter(string(@Name))" />.toString();
					return -s1.compareToIgnoreCase(s2);
					</xsl:when>
					<xsl:when test="contains(@Type, 'char') or contains(@Type, 'text')">
					String s1 = ent1.<xsl:value-of select="My:Getter(string(@Name))" />;
					String s2 = ent2.<xsl:value-of select="My:Getter(string(@Name))" />;
					return -s1.compareToIgnoreCase(s2);
					</xsl:when>
					<xsl:when test="contains(@Type, 'int') or contains(@Type, 'serial')">
					Long v1 = new Long(ent1.<xsl:value-of select="My:Getter(string(@Name))" />);
					Long v2 = new Long(ent2.<xsl:value-of select="My:Getter(string(@Name))" />);
					return -v1.compareTo(v2);
					</xsl:when>
					<xsl:when test="contains(@Type, 'boolean')">
					Boolean v1 = new Boolean(ent1.<xsl:value-of select="My:Getter(string(@Name))" />);
					Boolean v2 = new Boolean(ent2.<xsl:value-of select="My:Getter(string(@Name))" />);
					return -v1.compareTo(v2);
					</xsl:when>
					<xsl:otherwise>
					return 0;	
					</xsl:otherwise>
					</xsl:choose>
					
				}
			};
			}//if
			</xsl:for-each>
		}//if
	</xsl:for-each>
		return null;
	}//function

}//class

</xsl:template>
<!--=============================-->



	<msxsl:script language="VBScript" implements-prefix="My">
<![CDATA[ 
function Now()
	Now = FormatDateTime(Date()) & " " & FormatDateTime(Time())
end function

function Setter(s)
	Setter = "set" & UCase(Left(s, 1)) &  Mid(s, 2)
end function

function Getter(s)
	Getter = "get" & UCase(Left(s, 1)) &  Mid(s, 2) & "()"
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