<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans|Varela+Round">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style type="text/css">
body {
	background: #ebebeb;
	font-family: "Open Sans", sans-serif;
}
.col-center {
	margin: 0 auto;
	float: none !important;
}
.carousel {
	margin: 30px auto 60px;
	padding: 0 80px;
}
.carousel .item {
    text-align: center;
	overflow: hidden;
}
.carousel .item h4 {
	font-family: 'Varela Round', sans-serif;
}
.carousel .item img {
	max-width: 100%;
	display: inline-block;
}
.carousel .item .btn {
	border-radius: 0;
	font-size: 12px;
	text-transform: uppercase;
	font-weight: bold;
	border: none;
	background: #a177ff;
	padding: 6px 15px;
	margin-top: 5px;
}
.carousel .item .btn:hover {
	background: #8c5bff;
}
.carousel .item .btn i {
	font-size: 14px;
    font-weight: bold;
    margin-left: 5px;
}
.carousel .thumb-wrapper {
	margin: 5px;
	text-align: left;
    background: #fff;
    box-shadow: 0px 2px 2px rgba(0,0,0,0.1);   
}
.carousel .thumb-content {
	padding: 15px;
	font-size: 13px;
}
.carousel .carousel-control {
	height: 44px;
	width: 44px;
	background: none;	
    margin: auto 0;
    border-radius: 50%;
    border: 3px solid rgba(0, 0, 0, 0.8);
}
.carousel .carousel-control i {
    font-size: 36px;
    position: absolute;
    top: 50%;
    display: inline-block;
    margin: -19px 0 0 0;
    z-index: 5;
    left: 0;
    right: 0;
    color: rgba(0, 0, 0, 0.8);
	text-shadow: none;
    font-weight: bold;
}
.carousel .carousel-control.left i {
	margin-left: -3px;
}
.carousel .carousel-control.right i {
	margin-right: -3px;
}
.carousel .carousel-indicators {
	bottom: -50px;
}
.carousel-indicators li, .carousel-indicators li.active {
	width: 10px;
	height: 10px;
	border-radius: 50%;
	margin: 4px;
	border-color: transparent;
}
.carousel-indicators li {	
	background: #ababab;
}
.carousel-indicators li.active {	
	background: #555;
}

.myContainer1{
 margin-top : 200px;
 margin-bottom : 200px;
}

.myContainer2{
 margin-bottom : 200px;
}

h2 {
  text-align: center;
  padding-bottom : 50px;
}

.myP{
  font-size: large;
}

.myImg{
  height: 100px;
  width:100px;
  margin-bottom:30px;
}

</style>

</head>
<body>
	
	

	<div class="container myContainer1">
	
	<div>
	    <h2>Mes realisations</h2>
	</div>
	<div class="row myContainer2">
		<div class="col-md-10 col-center m-auto">
			<div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="0">
			<!-- Carousel indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
			</ol>   
			<!-- Wrapper for carousel items -->
			<div class="carousel-inner">
				<div class="item carousel-item active">
					<div class="row">
						<div class="col-sm-4">
							<div class="thumb-wrapper">
								<div class="img-box">
									<img src="resources/images/plat1.jpg" class="img-responsive img-fluid" alt="">
								</div>
														
							</div>
						</div>
						<div class="col-sm-4">
							<div class="thumb-wrapper">
								<div class="img-box">
									<img src="resources/images/plat2.jpg" class="img-responsive img-fluid" alt="">
								</div>
														
							</div>
						</div>				
						<div class="col-sm-4">
							<div class="thumb-wrapper">
								<div class="img-box">
									<img src="resources/images/plat3.jpg" class="img-responsive img-fluid" alt="">
								</div>
													
							</div>					
						</div>
					</div>
				</div>
				<div class="item carousel-item">
					<div class="row">
						<div class="col-sm-4">
							<div class="thumb-wrapper">
								<div class="img-box">
									<img src="resources/images/plat4.jpg" class="img-responsive img-fluid" alt="">
								</div>
												
							</div>
						</div>
						<div class="col-sm-4">
							<div class="thumb-wrapper">
								<div class="img-box">
									<img src="resources/images/plat5.jpg" class="img-responsive img-fluid" alt="">
								</div>
													
							</div>
						</div>
						<div class="col-sm-4">
							<div class="thumb-wrapper">
								<div class="img-box">
									<img src="resources/images/plat6.jpg" class="img-responsive img-fluid" alt="">
								</div>
														
							</div>					
						</div>
					</div>
				</div>
				<div class="item carousel-item">
					<div class="row">
						<div class="col-sm-4">
							<div class="thumb-wrapper">
								<div class="img-box">
									<img src="resources/images/plat7.jpg" class="img-responsive img-fluid" alt="">
								</div>
													
							</div>
						</div>
						<div class="col-sm-4">
							<div class="thumb-wrapper">
								<div class="img-box">
									<img src="resources/images/plat8.jpg" class="img-responsive img-fluid" alt="">
								</div>
														
							</div>
						</div>
						<div class="col-sm-4">
							<div class="thumb-wrapper">
								<div class="img-box">
									<img src="resources/images/plat9.jpg" class="img-responsive img-fluid" alt="">
								</div>
														
							</div>					
						</div>
					</div>
				</div>
			</div>
			<!-- Carousel controls -->
			<a class="carousel-control left carousel-control-prev" href="#myCarousel" data-slide="prev">
				<i class="fa fa-angle-left"></i>
			</a>
			<a class="carousel-control right carousel-control-next" href="#myCarousel" data-slide="next">
				<i class="fa fa-angle-right"></i>
			</a>
		</div>
		</div>
	</div>
	
	
	<div align="center">
	    <img src="resources/images/portrait1.png" class="img-responsive img-fluid myImg">
	</div>
	
	<div>
	    <h2>Mon parcours</h2>
	</div>
	<p class="myP"> Apres etre passes dans les cuisines de differents restaurants francais, en 1982, a l age de 26 ans, il devient le plus jeune chef a obtenir deux etoiles Michelin. Quatre ans plus tard, il reprend les renes des cuisines de L Archestrate qu il renomme L Arpege. En 1996, il obtient sa troisieme etoile. Aujourd hui, Pierre DUPONT concentre sa cuisine sur les legumes.</p>
	
	

</div>


</body>
</html>