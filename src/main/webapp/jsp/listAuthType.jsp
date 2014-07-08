<jsp:root version="1.2" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:fmt="http://java.sun.com/jsp/jstl/fmt" xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns="http://www.w3.org/1999/xhtml">
<jsp:directive.page contentType="text/html"/>
<jsp:directive.page import="models.*"/>
<jsp:directive.page import="app.*"/>
<jsp:directive.page import="java.util.*"/>
<jsp:scriptlet>
Html tag = new Html();
String appPath = application.getContextPath();
IEntity ent_master = (IEntity)request.getAttribute(Attr.MASTER);
String master_info = (ent_master != null) ? " of [" + ent_master.getFullInfo() + "]" : "";
String master_info_href = (ent_master != null) ? " of [" + tag.clear().buildHref(appPath + ent_master.getUrlEdit(), ent_master.getFullInfo()) + "]" : "";
String master_ident = (ent_master != null) ? ent_master.getIdent() : "";
String master_id = (ent_master != null) ? ent_master.getId().toString() : "";

List links_goto = (List)request.getAttribute(Attr.LINKS_GOTO);
IEntity EntityRef; //to show reference (example: Provider in CasinoAccount list)
</jsp:scriptlet>
<c:set var="appPath" value="${pageContext.servletContext.contextPath}"/>
<html>
<head>
<title>list:AuthType<jsp:expression>master_info</jsp:expression></title>
<link rel="stylesheet" media="screen" href="${appPath}/stylesheets/main.css"/>
<link rel="stylesheet" media="screen" href="${appPath}/stylesheets/bootstrap.min.css"/>
<link rel="shortcut icon" type="image/png" href="${appPath}/images/favicon.png"/>
<script src="${appPath}/javascripts/jquery-1.7.1.min.js" type="text/javascript"/>
<script type="text/javascript">
					function WriteCurrentUrl () {alert ("You clicked on the button!");}
				</script>
</head>
<body>
<header class="topbar">
<h1 class="fill">
<jsp:expression>tag.clear().buildHref(appPath, Finder.label)</jsp:expression>
<c:forEach var="link" items="${links}">
<a class="btn success" href="${appPath}${link.uri}">${link.caption}</a>
</c:forEach>
</h1>
</header>
<div id="main">
<h1 align="center">AuthType<span id="master_info"><jsp:expression>master_info_href</jsp:expression></span></h1>
<table class="zebra-striped entity-list" id="AuthType">
<thead>
<tr>
<th class="link_action" width="10%">
<jsp:expression>tag.clear().buildFormOpen(appPath + AuthType.takeUrlCreate())</jsp:expression>
<jsp:expression>tag.clear().setName(Attr.USER).setValue(request.getRemoteHost()).buildHidden()</jsp:expression>
<jsp:expression>tag.clear().setName(Const.MASTER_IDENT).setValue(master_ident).buildHidden()</jsp:expression>
<jsp:expression>tag.clear().setName(Const.MASTER_ID).setValue(master_id).buildHidden()</jsp:expression>
<jsp:expression>tag.clear().setClass(Html.CLASS_BTN_PRIMARY).setValue(Const.CREATE).buildSubmit()</jsp:expression>
<jsp:expression>Html.buildFormClose()</jsp:expression>
</th>
<th class="id" width="5%" xmlns=""><a href="?order=id">id</a></th>
<th class="code" width="*" xmlns=""><a href="?order=code">code</a></th>
<th class="name" width="*" xmlns=""><a href="?order=name">name</a></th>
</tr>
</thead>
<tbody>
<jsp:scriptlet>
Link link_goto;
List ents = (List)request.getAttribute(Attr.ENTITIES);
for (Object obj: ents ) {
AuthType ent = (AuthType)obj;
</jsp:scriptlet>
<tr>
<td>
<ul class="goto_menu">
<li><a href="#">GO TO</a>
<ul>
<li><jsp:expression>tag.clear().setClass(Html.CLASS_BTN_PRIMARY).buildHref(appPath + ent.getUrlEdit(), Const.EDIT + " " + ent.toString())</jsp:expression></li>
<jsp:scriptlet>for (Object lobj: links_goto ) {
				link_goto = (Link)lobj;
				link_goto.master_id = ent.getId();
			</jsp:scriptlet>
<li><jsp:expression>tag.clear().setClass(Html.CLASS_BTN_SUCCESS).buildHref(appPath + link_goto.getUri(), link_goto.getCaption())</jsp:expression></li>
<jsp:scriptlet>}</jsp:scriptlet>
</ul>
</li>
</ul>
</td>
<td xmlns=""><jsp:expression>ent.getId().toString()</jsp:expression></td>
<td xmlns=""><jsp:expression>ent.getCode()</jsp:expression></td>
<td xmlns=""><jsp:expression>ent.getName()</jsp:expression></td>
</tr>
<jsp:scriptlet>}</jsp:scriptlet>
</tbody>
</table>
</div>
</body>
</html>
</jsp:root>
