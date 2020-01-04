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
<title>Gestion Compte Prestataire</title>
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
	href="resources/css/gestionComptePrestataire.css" />
</head>

<body>
	<br>
	<section id="section4">

		<br> <br> <br>

		<div class="titre">
			<h1 align="center">Compte Prestataire</h1>
		</div>

		<br> <br>

		<div class="container">

			<form action="prestataire/updatePrestataire" method="post" role="form" modelAttribute="prestataire" autocomplete="off">

				<div class="row">

					<div class="col-xl-6 col-lg-6 col-md-6 col-sm-8 col-12">
						<div class="card card-outline-secondary">
							<div class="card-header" style="background-color: #E5E1E1">
								<h3 class="mb-0">Coordonnées</h3>
							</div>
							<div class="card-body">

								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Catégorie</label>
									<div class="col-lg-8 col-md-12">

										<select id="inputState" class="form-control">
											<option selected>Restauration</option>
											<option>Commerce de proxi</option>
											<option>Superette</option>
											<option>Pharmacie</option>
											<option>Aperitif</option>
											<option>Cosmetiques</option>
											<option>Shopping</option>
											<option>Cadeaux</option>
											<option>Services</option>
											<option>Enfants</option>
										</select>
									</div>
								</div>



								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Nom
										du gérant</label>
									<div class="col-lg-8 col-md-12">
										<input class="form-control" type="text" name="nom"
											id="nom" placeholder="NomGerant" value="${prestaSession.nom}"
											required>
									</div>
								</div>
								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Raison
										sociale</label>
									<div class="col-lg-8 col-md-12">
										<input type="text" class="form-control" name="raisonsocial"
											id="raisonsocial" placeholder="RaisonSocial"
											value="La Pizzathèque" required>
									</div>
								</div>

								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Numero</label>
									<div class="col-lg-8 col-md-12">
										<input type="text" class="form-control" name="numero"
											id="numero" placeholder="numero" value="16" required>
									</div>
								</div>

								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Adresse</label>
									<div class="col-lg-8 col-md-12">
										<input type="text" class="form-control" name="adresse"
											id="adresse" placeholder="adresse" value="alle jean jaures"
											required>
									</div>
								</div>

								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Code
										Postal</label>
									<div class="col-lg-8 col-md-12">
										<input type="text" class="form-control" name="codepostal"
											id="codepostal" placeholder="codepostal" value="31000"
											required>
									</div>
								</div>

								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Ville</label>
									<div class="col-lg-8 col-md-12">
										<input type="text" class="form-control" name="ville"
											id="ville" placeholder="ville" value="TOULOUSE" required>
									</div>
								</div>

								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Email</label>
									<div class="col-lg-8 col-md-12">
										<input type="email" class="form-control" name="email"
											id="email" placeholder="Email" value="${prestaSession.email}"
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
									<label class="col-lg-4 col-form-label form-control-label">Identifiant</label>
									<div class="col-lg-8 col-md-12">
										<input type="email" class="form-control" name="email"
											id="email" placeholder="Email" value="${prestaSession.email}"
											required disabled>
									</div>
								</div>
								
								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Mot de passe actuel</label>
									<div class="col-lg-8 col-md-12">
										<input type="password" class="form-control" name="pwd"
											id="pwd" placeholder="pwd" value="${prestaSession.pwd}" required>
									</div>
								</div>
								
								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Nouveau Mot de passe</label>
									<div class="col-lg-8 col-md-12">
										<input type="password" class="form-control" name="pwd"
											id="pwd" placeholder="8 caractères min" value="">
									</div>
								</div>
								
								<div class="form-group row">
									<label class="col-lg-4 col-form-label form-control-label">Confirmer nouveau Mot de passe</label>
									<div class="col-lg-8 col-md-12">
										<input type="password" class="form-control" name="pwd"
											id="pwd" placeholder="8 caractères min" value="">
									</div>
								</div>
								
							</div>
						</div>

						<div
							class="col col-md-12 justify-content-center row align-items-center">
							<input class="btn"
								style="background-color: #C88A7D; margin-top: 50px; margin-bottom: 50px"
								type="submit" value="Valider les modifications" />
						</div>
					</div>
				</div>
			</form>

		</div>
		<br> <br> <br>

		<div class="container">
			<form action="#" method="get" role="form" autocomplete="off">

				<div class="row">

					<div class="col-12">
				
						<div class="card card-outline-secondary">
						
							<div class="card-header" style="background-color: #E5E1E1">
								<h3 class=" col align-middle justify-content-center row align-items-center">Statistiques du compte</h3>
							</div>
							
							<div class="card-body">

								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label"></label>
									<div class="col"><label>jour</label></div>
									<div class="col"><label>semaine</label></div>
									<div class="col"><label>mois</label></div>
									<div class="col"><label>année</label></div>
									<div class="col"><label>total</label></div>
								</div>
								
								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Nombre de commandes réalisées</label>
									<div class="col"><input class="form-control" type="text" value="3"></div>
									<div class="col"><input class="form-control" type="text" value="23"></div>
									<div class="col"><input class="form-control" type="text" value="98"></div>
									<div class="col"><input class="form-control" type="text" value="1235"></div>
									<div class="col"><input class="form-control" type="text" value="7955"></div>
								</div>
								
								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Nombre de commandes en erreur</label>
									<div class="col"><input class="form-control" type="text" value="0"></div>
									<div class="col"><input class="form-control" type="text" value="3"></div>
									<div class="col"><input class="form-control" type="text" value="14"></div>
									<div class="col"><input class="form-control" type="text" value="115"></div>
									<div class="col"><input class="form-control" type="text" value="350"></div>
								</div>
								
								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Total commandes</label>
									<div class="col"><input class="form-control" type="text" value="3"></div>
									<div class="col"><input class="form-control" type="text" value="20"></div>
									<div class="col"><input class="form-control" type="text" value="84"></div>
									<div class="col"><input class="form-control" type="text" value="1120"></div>
									<div class="col"><input class="form-control" type="text" value="7605"></div>
								</div>
								
								<br>
								<br>
								
								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Nombre de produits / services vendus</label>
									<div class="col"><input class="form-control" type="text" value="12"></div>
									<div class="col"><input class="form-control" type="text" value="113"></div>
									<div class="col"><input class="form-control" type="text" value="428"></div>
									<div class="col"><input class="form-control" type="text" value="8475"></div>
									<div class="col"><input class="form-control" type="text" value="65448"></div>
								</div>

								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Nombre de produits / services en erreur</label>
									<div class="col"><input class="form-control" type="text" value="3"></div>
									<div class="col"><input class="form-control" type="text" value="12"></div>
									<div class="col"><input class="form-control" type="text" value="44"></div>
									<div class="col"><input class="form-control" type="text" value="445"></div>
									<div class="col"><input class="form-control" type="text" value="1424"></div>
								</div>
								
								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Nombre de produits / services total</label>
									<div class="col"><input class="form-control" type="text" value="9"></div>
									<div class="col"><input class="form-control" type="text" value="101"></div>
									<div class="col"><input class="form-control" type="text" value="384"></div>
									<div class="col"><input class="form-control" type="text" value="8031"></div>
									<div class="col"><input class="form-control" type="text" value="64024"></div>
								</div>
								
								<br>
								<br>
								
								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Chiffre d'affaire des ventes</label>
									<div class="col"><input class="form-control" type="text" value="325"></div>
									<div class="col"><input class="form-control" type="text" value="2840"></div>
									<div class="col"><input class="form-control" type="text" value="16840"></div>
									<div class="col"><input class="form-control" type="text" value="223050"></div>
									<div class="col"><input class="form-control" type="text" value="873200"></div>
								</div>
								
								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Chiffre d'affaire des pertes</label>
									<div class="col"><input class="form-control" type="text" value="22"></div>
									<div class="col"><input class="form-control" type="text" value="130"></div>
									<div class="col"><input class="form-control" type="text" value="620"></div>
									<div class="col"><input class="form-control" type="text" value="8640"></div>
									<div class="col"><input class="form-control" type="text" value="34600"></div>
								</div>
								
								<div class="form-group row">
									<label class="col-md-4 col-form-label form-control-label">Chiffre d'affaire total</label>
									<div class="col"><input class="form-control" type="text" value="303"></div>
									<div class="col"><input class="form-control" type="text" value="2710"></div>
									<div class="col"><input class="form-control" type="text" value="16220"></div>
									<div class="col"><input class="form-control" type="text" value="214410"></div>
									<div class="col"><input class="form-control" type="text" value="838600"></div>
								</div>
								
							</div>
						</div>
					</div>
				</div>

			</form>
		</div>
		
		<br> <br> <br>
		
	</section>




	<br>
	<br>
	<br>

</body>
</html>