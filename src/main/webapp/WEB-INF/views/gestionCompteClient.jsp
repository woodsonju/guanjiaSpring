<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Gestion Compte Client</title>
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
	href="resources/css/gestionCompteClient.css" />
</head>

<body>
	<br>
	<section id="section3">

		<br> <br> <br>

		<div class="titre">
			<h1 align="center">Compte Client
			</h1>
		</div>

		<br> <br>

		<div class="container">

			<form action="client/updateClient" method="post" role="form" modelAttribute="client" autocomplete="off">
             
             <input name="id" type="hidden" value="${client.id}"/>

				<div class="row">
					<div class="col-xl-6 col-lg-6 col-md-6 col-sm-8 col-12">
						<div class="card card-outline-secondary">
							<div class="card-header" style="background-color: #E5E1E1">
								<h3 class="mb-0">Coordonnées</h3>
							</div>
							<div class="card-body">
								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Nom</label>
									<div class="col-lg-8 col-md-12">
										<input type="text" class="form-control" name="nom" id="nom"
											placeholder="Nom" value="${userSession.nom}" required>
									</div>
								</div>                      		
								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Prénom</label>
									<div class="col-lg-8 col-md-12">
										<input class="form-control" type="text" name="prenom"
											id="prenom" placeholder="Prenom" value="${userSession.prenom}" required>
									</div>
								</div>

								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Date
										de naissance</label>
									<div class="col-lg-8 col-md-12">
										<input class="form-control" type="text" name="datenaissance"
											id="datenaissance" placeholder="Votre date de naissance"
											value="${userSession.dateNaissance}" required>
									</div>
								</div>

								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Email</label>
									<div class="col-lg-8 col-md-12">
										<input type="email" class="form-control" name="email"
											id="email" placeholder="email" value="${userSession.email}"
											required>
									</div>
								</div>
								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Téléphone</label>
									<div class="col-lg-8 col-md-12">
										<input type="text" class="form-control" name="numTelephone"
											id="telephone" placeholder="telephone" value="${userSession.numTelephone}"
											required>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-xl-6 col-lg-6 col-md-6 col-sm-8 col-12">
						<div class="card card-outline-secondary">
							<div class="card-header" style="background-color: #E4E1E1">
								<h3 class="mb-0">Connexion au compte</h3>
							</div>
							<div class="card-body">
								<div class="form-group row">
									<label class="col-lg-4  col-form-label form-control-label">Identifiant</label>
									<div class="col-lg-8 col-md-12">
										<input type="email" class="form-control" name="email"
											id="email" placeholder="email" value="${userSession.email}"
											required>
									</div>
								</div>
								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Mot
										de passe actuel</label>
									<div class="col-lg-8 col-md-12">
										<input type="password" class="form-control" name="pwd"
											id="pwd" placeholder="pwd" value="${userSession.pwd}" required>
									</div>
								</div>

								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Nouveau
										Mot de passe</label>
									<div class="col-lg-8 col-md-12">
										<input type="password" class="form-control" name="pwd"
											id="pwd" placeholder="8 caractères min" value="">
									</div>
								</div>

								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Confirmer
										nouveau Mot de passe</label>
									<div class="col-lg-8 col-md-12">
										<input type="password" class="form-control" name="pwd"
											id="pwd" placeholder="8 caractères min" value="">
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="row" style="margin-top: 60px">
					<div class="col-xl-6 col-lg-6 col-md-6 col-sm-8 col-12">
						<div class="card card-outline-secondary">
							<div class="card-header" style="background-color: #E4E1E1">
								<h3 class="mb-0">Adresse de Livraison</h3>
							</div>
							<div class="card-body">
								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Etage</label>
									<div class="col-lg-8 col-md-12">
										<input class="form-control" type="text" name="etage"
											id="etage" placeholder="etage" value="5" required>
									</div>
								</div>
								<div class="form-group row">
									<label class="col-lg-4  col-form-label form-control-label">Numero</label>
									<div class="col-lg-8 col-md-12">
										<input type="text" class="form-control" name="numero"
											id="numero" placeholder="numero" value="654" required>
									</div>
								</div>
								<div class="form-group row">
									<label class="col-lg-4  col-form-label form-control-label">Voie</label>
									<div class="col-lg-8 col-md-12">
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
								</div>
								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Nom de Voie</label>
									<div class="col-lg-8 col-md-12">
										<input type="text" class="form-control" name="nomDeVoie"
											id="email" placeholder="nomDeVoie" value="Saint Germain" required>
									</div>
								</div>
								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Code
										postal</label>
									<div class="col-lg-8 col-md-12">
										<input type="text" class="form-control" name="codePostale"
											id="codePostale" placeholder="codePostale" value="31750"
											required>
									</div>
								</div>

								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Ville</label>
									<div class="col-lg-8 col-md-12">
										<input type="text" class="form-control" name="ville"
											id="ville" placeholder="ville" value="Toulouse" required>
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
									<label class="col-lg-4 col-form-label form-control-label">Etage</label>
									<div class="col-lg-8 col-md-12">
										<input class="form-control" type="text" name="etage"
											id="etage" placeholder="etage" value="5" required>
									</div>
								</div>
								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Numero</label>
									<div class="col-lg-8 col-md-12">
										<input type="text" class="form-control" name="numero"
											id="numero" placeholder="numero" value="654" required>
									</div>
								</div>
								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Voie</label>
									<div class="col-lg-8 col-md-12">

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
								</div>
								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Nom de Voie</label>
									<div class="col-lg-8 col-md-12">
										<input type="text" class="form-control" name="nomDeVoie"
											id="email" placeholder="nomDeVoie" value="Saint Germain" required>
									</div>
								</div>
								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Code
										postal</label>
									<div class="col-lg-8 col-md-12">
										<input type="text" class="form-control" name="codePostale"
											id="codePostale" placeholder="codePostale" value="31750"
											required>
									</div>
								</div>
								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Ville</label>
									<div class="col-lg-8 col-md-12">
										<input type="text" class="form-control" name="ville"
											id="ville" placeholder="ville" value="Toulouse" required>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				
				<div class="row">
					<div
						class="col-xl-8 col-lg-8 col-md-8 col-sm-12 col-12 offset-md-9">
						<input class="btn"
							style="background-color: #C88A7D; margin-top: 50px; margin-bottom: 50px"
							type="submit" value="Valider les modifications" />
					</div>
				</div>
			</form>

		</div>
		<br>
	</section>
	<br>
	<br>
	<br>
</body>
</html>