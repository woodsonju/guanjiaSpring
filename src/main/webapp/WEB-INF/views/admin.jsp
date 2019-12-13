<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="true" %>

<!DOCTYPE html>

<head> 
    <title>Login/Register Form</title>
    <base href="<%=request.getScheme()+"://"+request.getServerName()
        +":"+request.getServerPort() + request.getContextPath() + "/"%>" />
</head>
<body>

<h3>PAGE ADMIN : pour gérer des utilisateurs</h3>

<table border="1">

    <tr>
        <td>Nom</td>
        <td>Prenom</td>
        <td>Email</td>
        <td>Actions</td>
    </tr>
    
    <c:forEach var="ul" items="${usersList}">
			<tr>
				<td>${ul.nom}</td>
				<td>${ul.prenom}</td>
				<td>${ul.email}</td>
				<td>
				    <a href="#">Supprimer</a>
				    <a href="#">Modifier</a>
				</td>
			</tr>
	</c:forEach>
</table>

<c:if test="${page>1}">
    <a href="admin/${page-1}/${max}">Precedent</a>
</c:if>
<span>page : ${page}</span>
<c:if test="${suivExist}">
    <a href="admin/${page+1}/${max}">Suivant</a>
</c:if>


</body>
</html>