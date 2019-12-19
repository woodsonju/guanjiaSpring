<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="true" %>

<!DOCTYPE html>

<head> 
    <title>Login/Register Form</title>
    <base href="<%=request.getScheme()+"://"+request.getServerName()
        +":"+request.getServerPort() + request.getContextPath() + "/"%>" />
        <link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>

<h3>PAGE ADMIN : pour gérer des utilisateurs</h3>

<div class="container table-responsive" style="margin-top: 100px">
<table border="1" class="table table-hover table-condensed ">
		<thead>
			<tr>
			    <th>Type Utilisateur</th>
				<th>Nom</th>
				<th>Prenom</th>
				<th>Email</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="ul" items="${usersList}">
				<tr>
				    <td>${ul.typeUtilisateur}</td>
					<td>${ul.nom}</td>
					<td>${ul.prenom}</td>
					<td>${ul.email}</td>
					<td>
					    <a href="admin/delete/${ul.id}" class="btn btn-danger btn-sm"><i class="fa fa-trash-o" aria-hidden="true">&nbsp;supprimer</i></a> 
                        <a href="#" class="btn btn-primary btn-sm"><i class="fa fa-pencil" aria-hidden="true"></i>&nbsp;modifier</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
</table>
</div>



<c:if test="${page>1}">
    <a href="admin/${page-1}/${max}">Precedent</a>
</c:if>
<span>page : ${page}</span>
<c:if test="${suivExist}">
    <a href="admin/${page+1}/${max}">Suivant</a>
</c:if>


</body>
</html>