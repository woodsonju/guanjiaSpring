<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header</title>


<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link rel="stylesheet" type="text/css"
	href="../../resources/css/header.css" />

</head>

<body>

	<nav
		class="navbar navbar-icon-top navbar-expand-lg navbar-dark bg-dark">

		<div class="container-fluid">
		
			<div class="row">
			
			<div class="accueil"
				id="navbarSupportedContent">
				<ul class="navbar-nav">
					<li class="nav-item active">
						<a class="nav-link" href="#"> 
							<img src="resources/images/home.png" alt="Logo" style="width: 40px;">
						</a>
					</li>
					<li class="nav-item active">
						<a class="nav-link" href="#">Accueil </a>
					</li>
				</ul>
			</div>
			
			
			<div class ="search d-none d-lg-block">
				<form style="margin-left: 100px;"
					class="form-inline my-2 my-lg-0 spacer">
					<button class="btn btn-outline-dark my-2 my-sm-0" type="submit">
						<img src="resources/images/search.png" alt="Logo"
							style="width: 25px;">
					</button>
					<input class="form-control mr-sm-2 d-none d-lg-block"" type="text"
						placeholder="Recherche produit ou service" aria-label="Search">
				</form>
			</div>
			
			<div class ="localisation d-none d-lg-block">
				<form style="margin-left: 100px;" class="form-inline spacer">
					<button class="btn btn-outline-dark my-2 my-sm-0" type="submit">
						<img src="resources/images/localisation.png" alt="Logo"
							style="width: 30px;">
					</button>
					<input class="form-control mr-sm-2 d-none d-lg-block"" type="text"
						placeholder="Toulouse" aria-label="Search">
				</form>
			</div>

			<div class ="panier">
				<ul style="margin-left: 100px;" class="navbar-nav spacer">
					<li class="nav-item active">
						<a class="nav-link" href="#"> 
							<img src="resources/images/panier.png" alt="Logo" style="width: 30px;">
						</a>
					</li>
					<li class="nav-item active">
						<a class="nav-link" href="#">Panier </a>
					</li>
				</ul>
			</div>
			
			<div class ="compte">
				<ul style="margin-left: 100px;" class="navbar-nav spacer">
					<li class="nav-item active"><a class="nav-link" href="#"> <img
							src="resources/images/compte.png" alt="Logo" style="width: 30px;">
					</a></li>
					<li class="nav-item active"><a class="nav-link" href="#">
							Compte </a></li>
				</ul>
			</div>
			
			</div>
		</div>
	</nav>
	
</body>
</html>


<!-- 
<header>
	<img src="resources/images/home.htm" width="50px" height="50px" /> Accueil
	<img src="resources/images/search.html" width="50px" height="50px" /> <input >

</header> -->
