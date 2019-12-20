<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Compte Admin</title>
<%-- <base href="<%=request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()+ request.getContextPath() + "/"%>" /> --%>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="resources/css/admin.css" />
</head>


<body>

	<br>

	<section id="section5">

			<br> <br> <br> <br>

		<div class="titre">
			<h1 align="center">Gestion des utilisateurs</h1>
		</div>

		<br> <br><br> <br>

		<div class="container table-responsive text-center myTable">
			<table class="table table-hover table-condensed">

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
							<td><a href="admin/delete/${ul.id}"
								class="btn btn-danger btn-sm"><i class="fa fa-trash-o"
									aria-hidden="true">&nbsp;supprimer</i></a> <!--                         
								<a href="#" class="btn btn-info btn-sm"><i class="fa fa-pencil" aria-hidden="true"></i>&nbsp;modifier</a> -->
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

		<div class="container table-responsive myDiv">
			<nav aria-label="Page navigation example ">

				<ul class="pagination pg-blue">
					<c:if test="${page>1}">
						<li class="page-item"><a class="page-link"
							href="admin/${page-1}/${max}">Precedent</a></li>
					</c:if>


					<c:forEach begin="1" end="${nbpage}" step="1" varStatus="nb">
						<li class="page-item"><a class="page-link"
							href="admin/${nb.index}/${max}"><c:out value="${nb.index}" /></a></li>
					</c:forEach>


					<c:if test="${suivExist}">
						<li class="page-item"><a class="page-link"
							href="admin/${page+1}/${max}">Suivant</a></li>
					</c:if>
				</ul>

			</nav>
		</div>
		
		<br> <br>
		
	</section>
	
</body>

</html>