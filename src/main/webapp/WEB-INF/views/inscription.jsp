<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="true" %>


<!-- <!doctype html>
<html>
<head>
Required meta tags
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

Bootstrap CSS
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<title>Inscription</title>
</head> -->
<body>
	<div class="container py-5">
		<div class="row">
			<div class="col-md-12">
				<h2 class="text-center mb-5">S'inscrire sur Guanjia</h2>
				<div class="row">
					<div class="col-md-6 mx-auto">
						<div class="card border-secondary">
							<div class="card-header">
								<h3 class="mb-0 my-2">Sign Up</h3>
							</div>
							<div class="card-body">
								<form:form class="form" role="form" method="post" action="utilisateur/addinscription"  modelAttribute="utilisateur-inscription" autocomplete="off">
									<div class="form-group">
										<form:label path="nom" for="inputNom">Nom</form:label> 
										<form:input path="nom" type="text" class="form-control" id="inputNom" placeholder="Nom"/>
										<form:errors path="nom" cssClass="error" />
									</div>
									<div class="form-group">
										<form:label path="prenom" for="inputPrenom">Prenom</form:label> 
										<form:input path="prenom" type="text" class="form-control" id="inputPrenom" placeholder="Prenom"/>
										<form:errors path="prenom" cssClass="error" />
									</div>
									<div class="form-group">
										<form:label path="email" for="inputEmail3">Email</form:label> 
										<form:input path="email" type="email" class="form-control" id="inputEmail3" placeholder="email@gmail.com" required=""/>
										<form:errors path="email" cssClass="error" />
									</div>
									<div class="form-group">
										<form:label path="numTelephone" for="inputNumTel">Numéro de telephone</form:label> 
										<form:input path="numTelephone" type="numTelephone" class="form-control" id="inputNumTel" placeholder="0500000000" required=""/>
										<form:errors path="numTelephone" cssClass="error" />
									</div> 
									<div class="form-group">
										<form:label path="pwd" for="inputPassword1">Password</form:label> 
										<form:input path="pwd" type="password" class="form-control" id="inputPassword1" placeholder="password" title="At least 6 characters with letters and numbers" required=""/>
										<form:errors path="pwd" cssClass="error" />
									</div>
									<div class="form-group">
										<form:label path="confirmpwd" for="inputPassword2">Confirm Password</form:label> 
										<form:input path="confirmpwd" type="password" class="form-control" id="inputPassword2" placeholder="password (again)" required="" />
										<form:errors path="confirmpwd" cssClass="error" />
									</div>
									<div class="form-group">
										<form:select path="typeUtilisateur" id="typeutilisateur">
											<form:option value="CLIENT">Client</form:option>
											<form:option value="PRESTATAIRE">Prestateur</form:option>
										</form:select>
									</div>
									<!-- A ajouter si on est prestataire
									<div class="form-group">
										<label for="inputRS">Raison Social</label> <input
											type=text class="form-control" id="inputRS"
											placeholder="raison social" required="">
									</div> -->
									<div class="form-group">
										<button type="submit"
											class="btn btn-success btn-lg float-right">Register</button>
									</div>
								</form:form>
							</div>
						</div>
					</div>
				</div>
				<!--/row-->

			</div>
			<!--/col-->
		</div>
		<!--/row-->
	</div>
	<!--/container-->


	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<!-- 	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script> -->
</body>
</html>