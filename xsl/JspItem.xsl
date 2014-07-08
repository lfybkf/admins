<?xml version="1.0" encoding="windows-1251"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
xmlns:My="localhost"
xmlns:msxsl="urn:schemas-microsoft-com:xslt"
exclude-result-prefixes="My msxsl">

<xsl:output encoding="WINDOWS-1251" omit-xml-declaration="yes" indent="yes" method="html" />
	<xsl:key name="EntityOnName" match="Entity" use="@Name" />
	<xsl:variable name="Schema" select="//Schema/@Name" />
	<xsl:param name="Ident" />

<!--==============================================-->
<xsl:template match="/" name="tmpMain">
	<xsl:apply-templates select="//Entity[@Class = $Ident]" />
</xsl:template>
<!--==============================================-->

<!--==========================================-->
<xsl:template match="Entity" >

	<jsp:root version="1.2"
						xmlns:jsp="http://java.sun.com/JSP/Page"
						xmlns:fmt="http://java.sun.com/jsp/jstl/fmt"
						xmlns:c="http://java.sun.com/jsp/jstl/core"
						xmlns="http://www.w3.org/1999/xhtml">
	<jsp:directive.page contentType="text/html" />
	<jsp:directive.page import="models.*"/>
	<jsp:directive.page import="app.*"/>

	<jsp:useBean id="entity" type="models.{@Class}" scope="request" />

<JSCR>
String appPath = application.getContextPath();
String ClassRef;
IEntity EntityRef;
Html tag = new Html();
Link link;
</JSCR>

	<c:set var="appPath" value="{My:EL('pageContext.servletContext.contextPath')}"/>
	<c:set var="reqPath" value="{My:EL('pageContext.request.contextPath')}"/>

<html>
	<head>
		<title>${entity.fullInfo}</title>
		<link rel="stylesheet" media="screen" href="{My:EL('appPath')}/stylesheets/main.css" />
		<link rel="stylesheet" media="screen" href="{My:EL('appPath')}/stylesheets/bootstrap.min.css"/>
		<link rel="shortcut icon" type="image/png" href="{My:EL('appPath')}/images/favicon.png"/>
		<script src="{My:EL('appPath')}/javascripts/jquery-1.7.1.min.js" type="text/javascript" />
		<script type="text/javascript">
			function WriteCurrentUrl () {alert ("You clicked on the button!");}
		</script>
	</head>
	<body>
		<header class="topbar">
			<h1 class="fill">
				<JEXPR>tag.clear().buildHref(appPath, Finder.label)</JEXPR>
				<c:forEach var="link" items="{My:EL('links')}">
					<a class="btn success" href="{My:EL('appPath')}{My:EL('link.uri')}">${link.caption}</a>
				</c:forEach>
			</h1>
		</header>
		<div id="main">
			<h2>${entity.type}: ${entity.id}</h2>
			<form action="{My:EL('appPath')}{My:EL('ourl.urlUpdate')}" method="POST" >
				<JEXPR>tag.clear().setName(Const.URL_LIST).setValue(request.getHeader(Const.REFERER)).buildHidden()</JEXPR>
				<table>
<xsl:apply-templates select="F[@Name != 'id']" />
				</table>
				<div class="actions"><input type="submit" value="Save" class="btn primary" /></div>
			</form>
		</div>
	</body>
</html>
</jsp:root>

</xsl:template>
<!--==========================================-->

	<!--==========================================-->
	<xsl:template match="F">
		<xsl:variable name="Label" select="@Name"/>
		<tr>
			<td width="15%">
				<label for="{@Name}">
					<xsl:choose>
						<xsl:when test="contains(@Name, '_id')">
<xsl:variable name="Entity" select="substring-before(@Name, '_id')"/>
<xsl:variable name="ClassRef" select="//Entity[@Name=$Entity]/@Class"/>
<JSCR>
ClassRef = "<xsl:value-of select="//Entity[@Name=$Entity]/@Class"/>";
EntityRef = entity.<xsl:value-of select="My:Getter(string(@Name))"/>;
</JSCR>
<JEXPR>(EntityRef != null) ? tag.clear().buildHref (appPath + EntityRef.getUrlEdit(), ClassRef) : ClassRef</JEXPR>
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="@Name"/>
						</xsl:otherwise>
					</xsl:choose>
				</label>
			</td>

			<td><!--value-->
		<xsl:choose>
			<xsl:when test="contains(@Name, '_id')">
				<xsl:variable name="EntityIdent" select="substring-before(@Name, '_id')"/>
				<xsl:variable name="LinkName" select="My:IfYes(string(@scChoose), 'all')"/>
<JSCR>link = Linkistry.findOnNameAndChild("<xsl:value-of select="$LinkName"/>", "<xsl:value-of select="$EntityIdent"/>");</JSCR>
<JEXPR>
tag.clear().setId("<xsl:value-of select="@Name"/>").setName("<xsl:value-of select="@Name"/>").setClass(Html.CLASS_LARGE).setReadonly("<xsl:value-of select="@scRO"/>")
	.setEntity(entity.<xsl:value-of select="My:Getter(string(@Name))"/>).buildSelect(link)
</JEXPR>
			</xsl:when>
			<xsl:when test="@Type='boolean'">
				<JEXPR>
tag.clear().setId("<xsl:value-of select="@Name"/>").setName("<xsl:value-of select="@Name"/>").setClass(Html.CLASS_LARGE).setReadonly("<xsl:value-of select="@scRO"/>")
	.setChecked(entity.<xsl:value-of select="My:Getter(string(@Name))"/>).buildCheckbox()
				</JEXPR>
			</xsl:when>
			<xsl:when test="contains(@Type, 'timestamp')">
				<JEXPR>
tag.clear().setId("<xsl:value-of select="@Name"/>").setName("<xsl:value-of select="@Name"/>").setClass(Html.CLASS_LARGE).setReadonly("<xsl:value-of select="@scRO"/>")
	.setDt(entity.<xsl:value-of select="My:Getter(string(@Name))"/>).buildDateText()
				</JEXPR>
			</xsl:when>
			<xsl:otherwise>
				<JEXPR>
tag.clear().setId("<xsl:value-of select="@Name"/>").setName("<xsl:value-of select="@Name"/>").setClass(Html.CLASS_LARGE).setReadonly("<xsl:value-of select="@scRO"/>")
	.setValue(entity.<xsl:value-of select="My:Getter(string(@Name))"/>).buildText()
				</JEXPR>
			</xsl:otherwise>
		</xsl:choose>
			</td>
		</tr>
	</xsl:template>
	<!--==========================================-->

<!-- recycle bin
============-->

<msxsl:script language="VBScript" implements-prefix="My">
<![CDATA[ 
function Now()
	Now = FormatDateTime(Date()) & " " & FormatDateTime(Time())
end function

function EL(aWhat)
	EL = "${" & aWhat & "}"
end function

function IfYes(aWhat, aDefault)
	If Len(aWhat) > 0 Then
		Ret = aWhat
	Else
		Ret = aDefault
	End If
	IfYes = Ret
end function

function Getter(s)
	Getter = "get" & UCase(Left(s, 1)) &  Mid(s, 2) & "()"
end function
]]> 
</msxsl:script> 
</xsl:stylesheet>