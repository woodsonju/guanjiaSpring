<%@page isErrorPage="false" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Dawan <sitemesh:write property='title' /></title>
	<!-- base sert à définir une référence qui préfixera l'ensemble des liens -->
<%-- 	<base href="<%=request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/"%>" />
 --%>	
	<sitemesh:write property='head' />
</head>

<body id="page-top">

	<%@include file="header.jsp" %>

	<sitemesh:write property='body' />
	
	<%@include file="footer.jsp" %>
	
</body>

</html>
