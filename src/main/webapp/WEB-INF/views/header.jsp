<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8"/>
<title></title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	
<link rel="stylesheet" type="text/css" href="../../resources/css/header.css"/>
</head>
<body>

<nav class="navbar navbar-icon-top navbar-expand-lg navbar-dark bg-dark">
	
	<div
		class="collapse navbar-collapse col-md-15 col-md-offset-3 col-sm-12 col-xm-12"
		id="navbarSupportedContent">
		
		<ul class="navbar-nav">
			<li class="nav-item active">
				<a class="nav-link" href="#"> 
					<img src="resources/images/home.png" alt="Logo" style="width: 40px;">
					
				</a>
			</li>
			<li class="nav-item active">
				<a class="nav-link" href="#">
				Accueil
				</a>
			</li>
		</ul>

		<form style = "margin-left: 100px;" class="form-inline my-2 my-lg-0 spacer">
			<button class="btn btn-outline-dark my-2 my-sm-0" type="submit">
				<img src="resources/images/search.png" alt="Logo"
					style="width: 25px;">
			</button>
			<input class="form-control mr-sm-2" type="text"
				placeholder="Recherche produit ou service" aria-label="Search">
		</form>

		<form style = "margin-left: 100px;" class="form-inline spacer">
			<button class="btn btn-outline-dark my-2 my-sm-0" type="submit">
				<img src="resources/images/localisation.png" alt="Logo"
					style="width: 30px;">
			</button>
			<input class="form-control mr-sm-2" type="text"
				placeholder="Toulouse" aria-label="Search">
		</form>


		<ul style = "margin-left: 100px;" class="navbar-nav spacer">
			<li class="nav-item active">
				<a class="nav-link" href="#"> <img
					src="resources/images/panier.png" alt="Logo" style="width: 30px;">
				</a>
			</li>
			<li class="nav-item active">
				<a class="nav-link" href="#">
				Panier
				</a>
			</li>
		</ul>

		<ul style = "margin-left: 100px;" class="navbar-nav spacer">
			<li class="nav-item active">
				<a class="nav-link" href="#"> <img
					src="resources/images/compte.png" alt="Logo" style="width: 30px;">
				</a>
			</li>
			<li class="nav-item active">
				<a class="nav-link" href="client/compteclient">
				Compte
				</a>
			</li>
		</ul>
				
			
			<div class="row">
				<div class="col-lg-8 col-xs-1"></div>
				<div class="col">
					<div>
						<a href="utilisateur/inscription"><button type="button" class="btn btn-black">Incription</button></a>
					</div>
				</div>
				<div class="col">
					<c:choose>
						<c:when test="${sessionScope.isConnected}"> 	
							<a href="logout"><button type="button" class="btn btn-black">Deconnexion</button></a>
							
						</c:when>
						<c:otherwise>
							<a href="login"><button type="button" class="btn btn-black">Connexion</button></a>
						</c:otherwise>
					</c:choose>
					<div class="col-lg-2 col-xs-1"></div>
				</div>
			</div>
				
	</div>
</nav>
</body>
</html>


