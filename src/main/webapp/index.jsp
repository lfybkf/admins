<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="controllers.*" %>
<%@ page import="app.*" %>

<% request.setAttribute("links", Linkistry.takeStarted()); %>
<c:set var="appPath" value="${pageContext.servletContext.contextPath}"/>
<c:set var="reqPath" value="${pageContext.request.contextPath}"/>

<html>
	<head>
		<title>${initParam.appname}</title>
<link rel="stylesheet" media="screen" href="${appPath}/stylesheets/main.css"/>
<link rel="stylesheet" media="screen" href="${appPath}/stylesheets/bootstrap.min.css"/>
<link rel="shortcut icon" type="image/png" href="${appPath}/images/favicon.png"/>
<script src="${appPath}/javascripts/jquery-1.7.1.min.js" type="text/javascript"></script>
<script type="text/javascript">
			function WriteCurrentUrl () {alert ("You clicked on the button!");}
		</script>
	</head>
<body>
<header class="topbar">
	<h1 class="fill">
		<a href="${appPath}">Go Home </a>
		
		<c:forEach var="link" items="${links}" >
			<a class="btn success" href='${appPath}${link.uri}'>${link.caption}</a>
		</c:forEach>
		

	</h1>
</header>
        
<div id="main">

<h1><%=Finder.label %></h1>
</div>

</body>
</html>
