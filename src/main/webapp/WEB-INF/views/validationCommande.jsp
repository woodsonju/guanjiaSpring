<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Commande</title>
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
	href="resources/css/validationCommande.css" />
</head>

<body>
	<br>
	<section id="section6">

		<br> <br> <br> <br>

		<div class="titre">
			<h1 align="center">Validez votre livraison</h1>
		</div>

		<br> 

		<div class="container">

			<form action="#" method="get" role="form" autocomplete="off">

							
				<div class="row" style="margin-top: 60px">
					<div class="col-xl-6 col-lg-6 col-md-6 col-sm-8 col-12">
						<div class="card card-outline-secondary">
							<div class="card-header" style="background-color: #E4E1E1">
								<h3 class="mb-0">Adresse de Livraison</h3>
							</div>
							<div class="card-body">
								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Etage</label>
									<div class="col-md-6 col-9">
										<input class="form-control" type="text" name="etage"
											id="etage" placeholder="etage" value="5" required disabled>
									</div>
									<div class="col-md-2 col-2">
										<button class="btn btn-dark">
											<i class="fa fa-plus fa-sm"></i>
										</button>
									</div>
								</div>
								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Numero</label>
									<div class="col-md-6 col-9">
										<input type="text" class="form-control" name="numero"
											id="numero" placeholder="numero" value="654" required
											disabled>
									</div>
									<div class="col-md-2 col-2">
										<button class="btn btn-dark">
											<i class="fa fa-plus fa-sm"></i>
										</button>
									</div>
								</div>
								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Voie</label>
									<div class="col-md-6 col-9">
										<select id="inputState" class="form-control">
											<option selected>avenue</option>
											<option>boulevard</option>
											<option>avenue</option>
											<option>rue</option>
											<option>impasse</option>
											<option>chemin</option>
											<option>passage</option>
										</select>
									</div>
									<div class="col-md-2 col-2">
										<button class="btn btn-dark">
											<i class="fa fa-plus fa-sm"></i>
										</button>
									</div>
								</div>
								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Nom de Voie</label>
									<div class="col-md-6 col-9">
										<input type="text" class="form-control" name="nomDeVoie"
											id="email" placeholder="nomDeVoie" value="Saint Germain" required
											disabled>
									</div>
									<div class="col-md-2  col-2">
										<button class="btn btn-dark">
											<i class="fa fa-plus fa-sm"></i>
										</button>
									</div>
								</div>
								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Code
										postal</label>
									<div class="col-md-6 col-9">
										<input type="text" class="form-control" name="codePostale"
											id="codePostale" placeholder="codePostale" value="31750"
											required disabled>
									</div>
									<div class="col-md-2  col-2">
										<button class="btn btn-dark">
											<i class="fa fa-plus fa-sm"></i>
										</button>
									</div>
								</div>

								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Ville</label>
									<div class="col-md-6 col-9">
										<input type="text" class="form-control" name="ville"
											id="ville" placeholder="ville" value="Toulouse" required
											disabled>
									</div>
									<div class="col-md-2 col-2">
										<button class="btn btn-dark ">
											<i class="fa fa-plus fa-sm"></i>
										</button>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-xl-6 col-lg-6 col-md-6 col-sm-8 col-12">
						<div class="card card-outline-secondary">
							<div class="card-header" style="background-color: #E4E1E1">
								<h3 class="mb-0">Adresse de facturation</h3>
							</div>
							<div class="card-body">
								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Etage</label>
									<div class="col-md-6 col-9">
										<input class="form-control" type="text" name="etage"
											id="etage" placeholder="etage" value="5" required disabled>
									</div>
									<div class="col-md-2 col-2">
										<button class="btn btn-dark">
											<i class="fa fa-plus fa-sm"></i>
										</button>
									</div>
								</div>
								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Numero</label>
									<div class="col-md-6 col-9">
										<input type="text" class="form-control" name="numero"
											id="numero" placeholder="numero" value="654" required
											disabled>
									</div>
									<div class="col-md-2 col-2">
										<button class="btn btn-dark">
											<i class="fa fa-plus fa-sm"></i>
										</button>
									</div>
								</div>
								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Voie</label>
									<div class="col-md-6 col-9">
										<select id="inputState" class="form-control">
											<option selected>avenue</option>
											<option>boulevard</option>
											<option>avenue</option>
											<option>rue</option>
											<option>impasse</option>
											<option>chemin</option>
											<option>passage</option>
										</select>
									</div>
									<div class="col-md-2 col-2">
										<button class="btn btn-dark">
											<i class="fa fa-plus fa-sm"></i>
										</button>
									</div>
								</div>
								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Nom de Voie</label>
									<div class="col-md-6 col-9">
										<input type="text" class="form-control" name="nomDeVoie"
											id="email" placeholder="nomDeVoie" value="Saint Germain" required
											disabled>
									</div>
									<div class="col-md-2  col-2">
										<button class="btn btn-dark">
											<i class="fa fa-plus fa-sm"></i>
										</button>
									</div>
								</div>
								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Code
										postal</label>
									<div class="col-md-6 col-9">
										<input type="text" class="form-control" name="codePostale"
											id="codePostale" placeholder="codePostale" value="31750"
											required disabled>
									</div>
									<div class="col-md-2 col-2">
										<button class="btn btn-dark">
											<i class="fa fa-plus fa-sm"></i>
										</button>
									</div>
								</div>
								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Ville</label>
									<div class="col-md-6 col-9">
										<input type="text" class="form-control" name="ville"
											id="ville" placeholder="ville" value="Toulouse" required
											disabled>
									</div>
									<div class="col-md-2 col-2">
										<button class="btn btn-dark ">
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
		
		<br>
		<br>
		<br>
		
		<div class="titre">
			<h2 align="center">Horaire de livraison</h2>
		</div>
		<br>
		<br>
		
		<div class ="row">
			<div class="col-2"></div>
			<div class="col-3 align-middle justify-content-center row align-items-center">
				<label>Dès que possible</label>
			</div>
			<div class="col-2"></div>
			<div class="col-3 align-middle justify-content-center row align-items-center">
				<label>Plus tard</label>
			</div>
			<div class="col-2"></div>
		</div>
		
		<div class ="row">
			<div class="col-2"></div>
			<div class="col-3">
				<input type="text" class="form-control" placeholder="ville" value="20 - 30 minutes" required disabled>
			</div>
			<div class="col-2"></div>
			<div class="col-3">
				<select id="inputState" class="form-control ">
					<option selected>Choix horaire</option>
					<option>09:00</option>
					<option>10:00</option>
					<option>11:00</option>
					<option>12:00</option>
					<option>13:00</option>
					<option>14:00</option>
					<option>15:00</option>
					<option>16:00</option>
					<option>17:00</option>
					<option>18:00</option>
					<option>19:00</option>
					<option>20:00</option>
				</select>
			</div>
			<div class="col-2"></div>
		</div>
		
		<br> <br> 
		
		<div class="row">
			<div
				class="col align-middle justify-content-center row align-items-center">
				<input class="btn"
					style="background-color: #C88A7D; margin-top: 50px; margin-bottom: 50px"
					type="submit" value="Valider la livraison" />
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