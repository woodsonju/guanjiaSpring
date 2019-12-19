<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<title>W3.CSS</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/quantiterpanier.js"></script>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />
<!-- <script src="/guanjia/resources/js/increment.js"></script>
 --></head>
<body>

	<div class="col-md-12">
		<h2 style="text-align: center">Votre panier</h2>
	</div>
	<table class="w3-table">
		<tr>
			<th></th>
			<th>ID Produit</th>
			<th>Prestation</th>
			<th>Prix/unit&eacute; &euro;</th>
			<th>Quantit&eacute;</th>
			<th>Total ligne &euro;</th>
			<th></th>
		</tr>

		<c:forEach items="${ mesLignes }" var="ligne" varStatus="i" >
			<tr>
				<td></td>
				<td>${ ligne.prestation.description }</td>
				<td><strong>Prestation</strong></td>
				<td class="price"><strong> <fmt:formatNumber
							value="${ ligne.prestation.prixPrestation}" pattern="##.##" />&euro;
				</strong></td>
				<td>
					<table>
						<tr>
							<td><div class="quantite input-group sm-2">
									<span class="input-group-btn"></span>
										<button onclick="decrement(${i.index})" type="button" class="btn btn-info btn-number"
											data-type="minus" data-field="quant[1]">
											<span class="number glyphicon glyphicon-minus"></span>
										</button>
									 <input type="text" id="i${i.index}" name="quant[i]"
										class="form-control input-number" value="1">
									<span class="input-group-btn"></span>
										<button onclick="increment(${i.index})" type="button" class="btn btn-success btn-number"
											data-type="plus" data-field="quant[1]">
											<span class="number glyphicon glyphicon-plus"></span>
										</button>
									
								</div></td>
								
								<td class="price"><strong> <fmt:formatNumber type = "number"
							value="${result}" pattern="##.##" /><fmt:setLocale value = "en_EURO"/>
				</strong></td>
						</tr>
					</table>

				</td>
				<td class="dsp-cell cell-remove"><a data-ajax="true"> <span
						class="icon icon-close"></span></a> <c:url value="/presentation"
						context="/springmvc" var="urleffacer" /> <a type="button"
					class="btn btn-success" href="${urleffacer}">effacer</a>
				<td>
			</tr>
		</c:forEach>
	</table>

	<div class="row">
		<div class="col-sm-8"></div>
		<div class="w3-container w3-third">
			<a>Total / Panier</a>
			<table class="col-sm-3 " style="background-color: green;">
				<tr>
					<td class="price"><fmt:formatNumber value="${result}"
							pattern="##.##" />&euro;</td>
					<td></td>
				</tr>

			</table>
			<table class="w3-table">
				<tr>
					<td>
						<p></p>
						<button type="button" class="col-ms-4 btn btn-success">VALIDER</button>
					</td>
				</tr>
			</table>
		</div>
	</div>

	<div class="container">
		<div class="col-lg-12 "></div>
		<div class="w3-table">
			<table>
				<tr>
					<td>
						<button type="button" class="col-ms-4 btn btn-success">Ajouter
							produit</button>
					</td>
				<tr>
			</table>
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


</body>
</html>