<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="true"%>

<!DOCTYPE html>

<html>

<head>
	<meta charset="UTF-8">
	<title>Connexion</title>
	<base
		href="<%=request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
						+ request.getContextPath() + "/"%>" />
	<link rel="stylesheet" type="text/css" href="resources/css/login.css" />
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">

</head>


<body>
	
	<section id="section2">

		<br> <br> <br> <br>

		<div class="titre mt-4">
			<h1 align="center">Connectez vous à Guanjia</h1>
		</div>

		<br> <br>

		<div class="container-fluid">
			<div class="row">
				<div class="col col-md-3"></div>
				<div class="col col-md-2 align-middle justify-content-center row align-items-center">
					<button class="btn btn-primary" type="button"><span><i class="fab fa-facebook-f"></i> Via Facebook</span></button>
				</div>
				<div class="col col-md-2"></div>
				<div class="col col-md-2 align-middle justify-content-center row align-items-center"><button class="btn btn-danger" type="button"><span><i class="fab fa-google-plus-g"></i> Via Google +</span>
					</button>
				</div>
				<div class="col col-md-3"></div>
			</div>
		</div>

 <br> <br>
 	<p style="text-align:center"> OU  </p>
 <br> <br>
 
		<form:form method="post" action="checkLogin"
			modelAttribute="utilisateur-form">

			<div class="form-group row">
				<div class="col col-md-4"></div>
				<div class ="col col-md-2 align-middle justify-content-center row align-items-center">
					<form:label path="email" class="col-sm-2 col-form-label"
						style="width: 100px;">Email</form:label>
				</div>
				<div class ="col col-md-2 align-middle justify-content-center row align-items-center">
					<form:input path="email" class="form-control" placeholder="a@a.com" style="width: 200px;"/>
				</div>
				<div class="col col-md-4"></div>
			</div>

			<div class="form-group row">
				<div class="col col-md-4"></div>
				<div class ="col col-md-2 align-middle justify-content-center row align-items-center">
					<form:label path="pwd" class="form-label"
						style="width: 100px;">Password</form:label>
				</div>
				<div class ="col col-md-2 align-middle justify-content-center row align-items-center">
					<form:input path="pwd" class="form-control" id="inputPassword"
						placeholder="8 caractères min" style="width: 200px;" />
				</div>
				<div class="col col-md-4"></div>
			</div>

			<div class="form-group row">
				<div class="col col-md-6"></div>
				<div>
					<div>
						<a href="mot-de-passe-oublie" id="forgot_pswd">Mot de passe oublié</a>
					</div>
				</div>
				<div class="col col-md-5"></div>
			</div>



			<div class="form-group row">
				<div class="col-5"></div>
				<div class="col-2">
					<input type="submit" value="Se connecter" class="btn btn-dark" />
				</div>
				<div class="align-middle">
					<p style="text-align:center" class="text-danger">${msg}</p>
				</div>
				<div class="col-4"></div>
			</div>
		</form:form>

		

		<br> <br> 





	</section>

</body>
</html>



