<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<title>W3.CSS</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />
</head>
<body>

	<div class="col-md-12 center">
		<h2 class="title-1" style="text-align: center">Votre panier :</h2>
	</div>
	<table class="w3-table">
		<tr>
			<th>ID Produit</th>
			<th>Prestation</th>
			<th>Prix/unit&eacute; &euro;</th>
			<th></th>
			<th>Quantit&eacute;</th>
			<th></th>
			<th>Total ligne &euro;</th>
		</tr>

		<c:forEach items="${ mesLignes }" var="ligne">
			<tr>
				<td>${ ligne.prestation.description }</td>
				<td><strong>Prestation</strong></td>
				<td class="price"><strong> <fmt:formatNumber
							value="${ ligne.prestation.prixPrestation}" pattern="##.##" />&euro;
				</strong></td>
				<td><button type="button" class="w3-circle w3-blue">-</button></td>
				<td><span class="Quantité">${ ligne.quantite }</span></td>
				<td><button type="button" class="w3-circle w3-green">+</button></td>
				<td class="price"><strong><fmt:formatNumber
							value="${ ligne.prixTotal }" pattern="#####.##" /></strong></td>
				<td><div class="dsp-cell cell-remove">
						<a data-ajax="true"
							data-ajax-complete="completeAjaxAfterItemAction"
							data-ajax-loading="#ajaxWait" data-ajax-method="POST"
							href="/fr-fr/Cart/RemoveItem/AR201901020017"> <span
							class="icon icon-close"></span></a>
						<c:url value="/presentation" context="/springmvc" var="urleffacer" />
						<a type="button" class="btn btn-success" href="${urleffacer}">effacer</a>
					</div>
				<td>
			</tr>
		</c:forEach>
		<tr>
	</table>

	<div class="w3-row">
		<div class="w3-container w3-twothird "></div>
		<div class="w3-green w3-container w3-third">
			<strong>Total / Presentation</strong>
			<table class="w3-table">
				<tr>
					<th class="price"><fmt:formatNumber value="${result}"
							pattern="##.##" />&euro;</th>
				</tr>
			</table>
		</div>
	</div>

	<div class="container">
		<div class="row">
				<button type="button" class="btn btn-success">Ajouter produit</button>
			<div class="col-lg-8"></div>
			<button type="button" class="btn btn-success">VALIDER</button>
			<div class="col-lg-2 text-align: right"></div>
		</div>
	</div>

	<section class="version desktop">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-2 d-none d-lg-block"></div>
				<div class="col">
					<a href="#" class="btn-circle btn-light"> <img
						src="resources/images/caddi.jpeg" width="100" height="100">
					</a>
				</div>
				<div class="col">
					<a href="#" class="btn-circle btn-light"> <img
						src="resources/images/cartebleu.png" width="100" height="100">
					</a>
				</div>
				<div class="col">
					<a href="#" class="btn-circle btn-light"> <img
						src="resources/images/velo.jpeg" width="100" height="100">
					</a>
				</div>
				<div class="col">
					<a href="#" class="btn-circle btn-light"> <img
						src="resources/images/euro.png" width="100" height="100">
					</a>
				</div>
			</div>
		</div>
	</section>



	</div>
</body>
</html>