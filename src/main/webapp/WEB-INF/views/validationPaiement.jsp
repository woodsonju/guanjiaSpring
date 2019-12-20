<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Paiement</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css"
	href="resources/css/validationPaiement.css" />
</head>

<body>
	<br>
	<section id="section7">

		<br> <br> <br> <br>

		<div class="titre">
			<h1 align="center">Validez votre paiement</h1>
		</div>

		<br>
		<br>
		<br>

		<div class="container-fluid">

			<div class="row">

				<div class="col-2"></div>

				<div
					class="col-2 align-middle justify-content-center row align-items-center">
					<img src="resources/images/cartemastercard2.png" class="img-fluid" alt="Responsive image"> 
				</div>

				<div class="col-1"></div>

				<div
					class="col-2 align-middle justify-content-center row align-items-center">
					<img src="resources/images/cartevisa2.png" class="img-fluid" alt="Responsive image"> 
				</div>
				
				<div class="col-1"></div>

				<div
					class="col-2 align-middle justify-content-center row align-items-center">
					<img src="resources/images/carteamericanexpress.png" class="img-fluid" alt="Responsive image"> 
				</div>

				<div class="col-2"></div>
			</div>

			<br>

			<div class="container-fluid">
				<div class="row">
					
					<div class="col-2"></div>

				<div class="col-2 align-middle justify-content-center row align-items-center">
					<input type="radio" name="optradio" checked>
				</div>

				<div class="col-1"></div>

				<div class="col-2 align-middle justify-content-center row align-items-center">
					<input type="radio" name="optradio">
				</div>
				
				<div class="col-1"></div>

				<div class="col-2 align-middle justify-content-center row align-items-center">
					<input type="radio" name="optradio" checked>
				</div>

				<div class="col-2"></div>
					
				</div>
			</div>
			
			<form action="#" method="get" role="form" autocomplete="off">

				<div
					class="row align-middle justify-content-center row align-items-center"
					style="margin-top: 60px">

					<div class="col-xl-6 col-lg-6 col-md-6 col-sm-8 col-12">
						<div class="card card-outline-secondary">
							<div class="card-header" style="background-color: #E4E1E1">
								<h3 class="mb-0">Ajouter une carte</h3>
							</div>
							<div class="card-body">
								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Nom
										du titulaire</label>
									<div class="col-md-6 col-9">
										<input class="form-control" type="text" name="nomtitulaire"
											id="nomtitulaire" placeholder="nomtitulaire" value="CAVANI"
											required disabled>
									</div>
									<div class="col-md-2 col-2">
										<button class="btn btn-dark">
											<i class="fa fa-plus fa-sm"></i>
										</button>
									</div>
								</div>
								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Numero
										de carte</label>
									<div class="col-md-6 col-9">
										<input type="text" class="form-control" name="numerocarte"
											id="numerocarte" placeholder="numerocarte"
											value="5154 9389 1158 6854" required disabled>
									</div>
									<div class="col-md-2 col-2">
										<button class="btn btn-dark">
											<i class="fa fa-plus fa-sm"></i>
										</button>
									</div>
								</div>

								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Date
										d'expiration</label>
									<div class="col-md-6 col-9">
										<input type="text" class="form-control" name="dateexpiration"
											id="dateexpiration" placeholder="dateexpiration"
											value="09/2021" required disabled>
									</div>
									<div class="col-md-2  col-2">
										<button class="btn btn-dark">
											<i class="fa fa-plus fa-sm"></i>
										</button>
									</div>
								</div>
								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Cryptogramme</label>
									<div class="col-md-6 col-9">
										<input type="text" class="form-control" name="cryptogramme"
											id="cryptogramme" placeholder="cryptogramme" value="874"
											required disabled>
									</div>
									<div class="col-md-2  col-2">
										<button class="btn btn-dark">
											<i class="fa fa-plus fa-sm"></i>
										</button>
									</div>
								</div>


							</div>
						</div>
					</div>

				</div>

			</form>

		</div>

		<br> <br> 


		<div class="row">
			<div
				class="col align-middle justify-content-center row align-items-center">
				<input class="btn"
					style="background-color: #C88A7D; margin-top: 50px; margin-bottom: 50px"
					type="submit" value="Valider le paiement" />
			</div>
		</div>

		<br> <br>

		<div class="container-fluid">

			<div class="row align-middle justify-content-center row align-items-center">
			
				<div class="col-1"></div>
				
				<div class="col-1 align-middle justify-content-center row align-items-center">
					<img src="resources/images/Ppanier2.png"class="img-fluid" alt="Responsive image">
				</div>
				
				<div class="col-1"></div>
				
				<div class="col-1 align-middle justify-content-center row align-items-center">
					<img src="resources/images/Pcarte2.png" class="img-fluid" alt="Responsive image">
				</div>
				<div class="col-1"></div>
				
				<div class="col-1 align-middle justify-content-center row align-items-center">
					<img src="resources/images/Pagreement2.png" class="img-fluid" alt="Responsive image">
				</div>
				
				<div class="col-1"></div>
				
				<div class="col-1 align-middle justify-content-center row align-items-center">
					<img src="resources/images/Plivraison3.png" class="img-fluid" alt="Responsive image">
				</div>
				
				<div class="col-1"></div>
			</div>
		</div>
	<br>
	<br>
	
	</section>

	<br>
	<br>
	<br>

</body>
</html>