<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<title>W3.CSS</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<div class="col-md-12 center">
	<h2 class="title-1">Votre panier :</h2>
</div>
<table class="w3-table">
	<tr>
		<th>ID Produit</th>
		<th>Prestation</th>
		<th>Prix/unité</th>
		<th></th>
		<th>Quantité</th>
		<th></th>
		<th>Total ligne</th>
	</tr>

	<c:forEach items="${ mesLignes }" var="ligne">
		<tr>
			<td>${ ligne.prestation.description }</td>
			<td><strong>Prestation</strong></td>
			<td><span class="price">${ ligne.prestation.prixPrestation }</span></td>
			<td><button type="button" class="w3-circle w3-blue"quantiter: ${ moin }>-</td>
			<td><span class="Quantité">${ ligne.quantite }</span>
				<button type="button" class="w3-circle w3-green"quantiter: ${ add }>+</button></td>
			<td><span class="price">${ ligne.prixTotal }</span></td>
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
				<th>${result}</th>
			</tr>
		</table>
	</div>
</div>

<div class="container">
	<div class="row">
		<div class="col-md-1"></div>
		<h1>+</h1>
		<button type="button" class="btn btn-success">Ajouter produit</button>
		<div class="col-md-10"></div>

		<button type="button" class="btn btn-success">VALIDER</button>
		<div class="col-md-1"></div>
	</div>
</div>

<section class="version desktop">
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-2 d-none d-lg-block"></div>
			<div class="col">
				<a href="#" class="btn-circle btn-light">
					<img src="resources/images/caddi.jpeg" width="50" height="50">
				</a>
			</div>
			<div class="col">
				<a href="#" class="btn-circle btn-light">
					<img src="resources/images/cartebleu.png" width="50"
					height="50">
				</a>
			</div>
			<div class="col">
				<a href="#" class="btn-circle btn-light">
					<img src="resources/images/velo.jpeg" width="50"
					height="50">
				</a>
			</div>
			<div class="col">
				<a href="#" class="btn-circle btn-light">
					<img src="resources/images/euro.png" width="50"
					height="50">
				</a>
			</div>
		</div>
	</div>
</section>



