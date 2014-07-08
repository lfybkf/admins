<?xml version="1.0" encoding="windows-1251"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
xmlns:My="localhost" 
xmlns:msxsl="urn:schemas-microsoft-com:xslt"
exclude-result-prefixes="My msxsl">

<xsl:output encoding="WINDOWS-1251" omit-xml-declaration="yes" indent="yes" method="text" />
<xsl:variable name="Schema" select="//Schema/@Name" />
	<xsl:param name="one_bat" />

<!--==============================================-->
<xsl:template match="/" name="tmpMain">
	<xsl:apply-templates select="//Entity[@Class]" />
</xsl:template>
<!--==============================================-->

<!--==========================================-->
<xsl:template match="Entity" >
	call <xsl:value-of select="$one_bat"/>.bat <xsl:value-of select="@Class"/>

</xsl:template>
<!--==========================================-->

</xsl:stylesheet>