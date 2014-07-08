<?xml version="1.0" encoding="windows-1251"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
xmlns:My="localhost" 
xmlns:msxsl="urn:schemas-microsoft-com:xslt"
exclude-result-prefixes="My msxsl">

<xsl:output encoding="WINDOWS-1251" omit-xml-declaration="yes" indent="yes" method="html" />
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
<JDIR contentType="text/html" />
<JDIR import="models.*"/>
<JDIR import="app.*"/>
<JDIR import="java.util.*"/>

<JSCR>
Html tag = new Html();
String appPath = application.getContextPath();
IEntity ent_master = (IEntity)request.getAttribute(Attr.MASTER);
String master_info = (ent_master != null) ? " of [" + ent_master.getFullInfo() + "]" : "";
String master_info_href = (ent_master != null) ? " of [" + tag.clear().buildHref(appPath + ent_master.getUrlEdit(), ent_master.getFullInfo()) + "]" : "";
String master_ident = (ent_master != null) ? ent_master.getIdent() : "";
String master_id = (ent_master != null) ? ent_master.getId().toString() : "";

List links_goto = (List)request.getAttribute(Attr.LINKS_GOTO);
IEntity EntityRef; //to show reference (example: Provider in CasinoAccount list)
</JSCR>

<c:set var="appPath" value="{My:EL('pageContext.servletContext.contextPath')}"/>
		<html>
			<head>
				<title>list:<xsl:value-of select="@Class"/> <JEXPR>master_info</JEXPR></title>
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
			<h1 align="center" ><xsl:value-of select="@Class"/> <span id="master_info"><JEXPR>master_info_href</JEXPR></span></h1>
	<table class="zebra-striped entity-list" id="{@Class}">
		<thead>
			<tr>
				<th class="link_action" width="10%">
<JEXPR>tag.clear().buildFormOpen(appPath + <xsl:value-of select="@Class"/>.takeUrlCreate())</JEXPR>
	<JEXPR>tag.clear().setName(Attr.USER).setValue(request.getRemoteHost()).buildHidden()</JEXPR>
	<JEXPR>tag.clear().setName(Const.MASTER_IDENT).setValue(master_ident).buildHidden()</JEXPR>
	<JEXPR>tag.clear().setName(Const.MASTER_ID).setValue(master_id).buildHidden()</JEXPR>
	<JEXPR>tag.clear().setClass(Html.CLASS_BTN_PRIMARY).setValue(Const.CREATE).buildSubmit()</JEXPR>
<JEXPR>Html.buildFormClose()</JEXPR>
				</th>
				<xsl:apply-templates select="F[@scWidth]" mode="head" />
			</tr>
		</thead>
		<tbody>
<JSCR>
Link link_goto;
List ents = (List)request.getAttribute(Attr.ENTITIES);
for (Object obj: ents ) {
<xsl:value-of select="@Class"/> ent = (<xsl:value-of select="@Class"/>)obj;
</JSCR>

<tr>
<td>
<ul class="goto_menu">
	<li><a href="#">GO TO</a>
		<ul>
			<li><JEXPR>tag.clear().setClass(Html.CLASS_BTN_PRIMARY).buildHref(appPath + ent.getUrlEdit(), Const.EDIT + " " + ent.toString())</JEXPR></li>
			<JSCR>for (Object lobj: links_goto ) {
				link_goto = (Link)lobj;
				link_goto.master_id = ent.getId();
			</JSCR>
				<li><JEXPR>tag.clear().setClass(Html.CLASS_BTN_SUCCESS).buildHref(appPath + link_goto.getUri(), link_goto.getCaption())</JEXPR></li>
			<JSCR>}</JSCR>
		</ul>
	</li>
</ul>
</td>
	<xsl:apply-templates select="F[@scWidth]" mode="item" />
</tr>
<JSCR>}</JSCR>
		</tbody>
	</table>

				</div>
	</body>
</html>
</jsp:root>
</xsl:template>
<!--==========================================-->

	<!--==========================================-->
	<xsl:template match="F" mode="head">
		<th class="{@Name}" width="{@scWidth}">
			<a href="{concat('?order=', @Name)}">
			<xsl:choose>
				<xsl:when test="contains(@Name, '_id')">
					<xsl:variable name="Entity" select="substring-before(@Name, '_id')"/>
					<xsl:value-of select="//Entity[@Name=$Entity]/@Class"/>
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="@Name"/>
				</xsl:otherwise>
			</xsl:choose>
			</a>
		</th>
	</xsl:template>
	<!--==========================================-->

<!--==========================================-->
<xsl:template match="F" mode="item">
	<td>
		<xsl:choose>
			<xsl:when test="contains(@Name, '_id')">
<JSCR>
EntityRef = ent.<xsl:value-of select="My:Getter(string(@Name))"/>;
</JSCR>
<JEXPR>(EntityRef != null) ? tag.clear().buildHref (appPath + EntityRef.getUrlEdit(), EntityRef) : Const.REF_EMPTY</JEXPR>
			</xsl:when>
			<xsl:when test="@Name = 'id'">
<JEXPR>ent.getId().toString()</JEXPR>
			</xsl:when>
			<xsl:otherwise>
<JEXPR>ent.<xsl:value-of select="My:Getter(string(@Name))"/></JEXPR>
			</xsl:otherwise>
		</xsl:choose>
		</td>

</xsl:template>
<!--==========================================-->

	<!-- recycle bin
				<c:forEach var="entity" items="{My:EL('entities')}">
				<JEXPR>tag.clear().setName(Attr.URL_LIST).setValue(request.getAttribute(Attr.URL_LIST).toString()).buildHidden()</JEXPR>

	//List  <![CDATA[<]]><xsl:value-of select="@Class"/>> entities = (<![CDATA[<]]><xsl:value-of select="@Class"/>>)request.getAttribute(Attr.ENTITIES);
//for (<xsl:value-of select="@Class"/> ent: entities ) {

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