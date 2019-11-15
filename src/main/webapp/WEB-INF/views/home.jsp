<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
	<h1>Bienvenue chez Guanjia</h1>

	<div class="container-fluid">
		<div class="col-md-offset-3">
			<button type="button" class="btn btn-dark btn-sm float-right">Inscription</button>
		</div>
		<div class="col-md-offset-3">
			<button type="button" class="btn btn-dark btn-sm float-right">Connexion</button>
		</div>
	</div>

	<div class="row d-flex flex-wrap" style="margin-top: 100px">
		<div class="align-middle">
			<div class="col-xs-4 col-sm-3 col-md-4">
				<a href="#" class="btn btn-light stretched-link"><img
					src="resources/images/restaurant.png" alt="Restauration"></a>
			</div>
		</div>


		<div class="col-xs-4 col-sm-3 col-md-4">
			<a href="#" class="btn btn-light stretched-link"><img
				src="resources/images/superette.png" alt="Superette"></a>
		</div>

		<div class="align-middle">
			<div class="col-xs-4 col-sm-3 col-md-4">
				<a href="#" class="btn btn-light stretched-link"><img
					src="resources/images/pharmacie.png" alt="Pharmacie"></a>
			</div>
		</div>
		
		<div class="align-bottom">
			<div class="col-xs-4 col-sm-3 col-md-4">
				<a href="#" class="btn btn-light stretched-link"><img
					src="resources/images/aperitif.png" alt="Aperitif"></a>
			</div>
		</div>

		<div class="align-bottom">
			<div class="col-xs-4 col-sm-3 col-md-4">
				<a href="#" class="btn btn-light stretched-link"> <img
					src="resources/images/cosmétiques.png" alt="Cosmétiques"></a>
			</div>
		</div>

		<div class="col-xs-4 col-sm-3 col-md-4">
			<a href="#" class="btn btn-light stretched-link"><img
				src="resources/images/market.png" alt="Shopping"></a>
		</div>
		
		<div class="col-xs-4 col-sm-3 col-md-4">
			<a href="#" class="btn btn-light stretched-link"><img
				src="resources/images/cadeaux.png" alt="cadeaux"></a>
		</div>
		
		<div class="col-xs-4 col-sm-3 col-md-4">
			<a href="#" class="btn btn-light stretched-link"><img
				src="resources/images/coursier.png" alt="Coursier"></a>
		</div>

		<div class="align-top">
			<div class="col-xs-4 col-sm-3 col-md-4">
				<a href="#" class="btn btn-light stretched-link"><img
					src="resources/images/child.png" alt="Enfant"></a>
			</div>
		</div>

		<div class="align-top">
			<div class="col-xs-4 col-sm-3 col-md-4">
				<a href="#" class="btn btn-light stretched-link"><img
					src="resources/images/panier.png" alt="Commerce de proximité"></a>
			</div>
		</div>
	</div>


	<%-- 	<P>The time on the server is ${serverTime}.</P>
 --%>
</body>
</html>
