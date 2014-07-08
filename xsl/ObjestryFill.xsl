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

	public class Objestry_Fill
	{

	public static void justDoIt()
	{
	<xsl:for-each select="//Entity[@Class]">
		<xsl:sort select="@Class"/>
		Objestry.add(<xsl:value-of select="@Class" />.takeIdent(), <xsl:value-of select="@Class" />.class);
	</xsl:for-each>
	}//function

	}//class

</xsl:template>

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