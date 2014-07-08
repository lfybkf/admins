<jsp:root version="1.2" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:fmt="http://java.sun.com/jsp/jstl/fmt" xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns="http://www.w3.org/1999/xhtml">
<jsp:directive.page contentType="text/html"/>
<jsp:directive.page import="models.*"/>
<jsp:directive.page import="app.*"/>
<jsp:useBean id="entity" type="models.Server" scope="request"/>
<jsp:scriptlet>
String appPath = application.getContextPath();
String ClassRef;
IEntity EntityRef;
Html tag = new Html();
Link link;
</jsp:scriptlet>
<c:set var="appPath" value="${pageContext.servletContext.contextPath}"/>
<c:set var="reqPath" value="${pageContext.request.contextPath}"/>
<html>
<head>
<title>${entity.fullInfo}</title>
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
<h2>${entity.type}: ${entity.id}</h2>
<form action="${appPath}${ourl.urlUpdate}" method="POST">
<jsp:expression>tag.clear().setName(Const.URL_LIST).setValue(request.getHeader(Const.REFERER)).buildHidden()</jsp:expression>
<table>
<tr xmlns="">
<td width="15%"><label for="name">name</label></td>
<td><jsp:expression>
tag.clear().setId("name").setName("name").setClass(Html.CLASS_LARGE).setReadonly("")
	.setValue(entity.getName()).buildText()
				</jsp:expression></td>
</tr>
<tr xmlns="">
<td width="15%"><label for="code">code</label></td>
<td><jsp:expression>
tag.clear().setId("code").setName("code").setClass(Html.CLASS_LARGE).setReadonly("")
	.setValue(entity.getCode()).buildText()
				</jsp:expression></td>
</tr>
<tr xmlns="">
<td width="15%"><label for="address">address</label></td>
<td><jsp:expression>
tag.clear().setId("address").setName("address").setClass(Html.CLASS_LARGE).setReadonly("")
	.setValue(entity.getAddress()).buildText()
				</jsp:expression></td>
</tr>
</table>
<div class="actions"><input type="submit" value="Save" class="btn primary"/></div>
</form>
</div>
</body>
</html>
</jsp:root>
