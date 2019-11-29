<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
    content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <base href="<%=request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/"%>" />

<!-- Bootstrap CSS -->
<link rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.0/css/bootstrap.min.css"
    integrity="sha384-SI27wrMjH3ZZ89r4o+fGIJtnzkAnFs3E4qz9DIYioCQ5l9Rd/7UAa8DHcaL8jkWt"
    crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Gestion Compte Client</title>
</head>
<body>                    
        <div class="container"style="margin-top: 30px">
            <form action="#" method="post" role="form" autocomplete="off">
               
                <div class="row">   
                    <div class="card card-outline-secondary">
                        <div class="card-header">
                            <h3 class="mb-0">Coordonnée</h3>
                        </div>
                        <div class="card-body">
                                <div class="form-group row">
                                    <label class="col-md-4 col-form-label form-control-label">Prenom</label>
                                    <div class="col-md-6">
                                        <input class="form-control" type="text" name="prenom" id="prenom" placeholder="Prenom" value="Woodson" required>
                                    </div>
                                        <div class="col-md-2">
                                            <button class="btn btn-dark"><i class="fa fa-plus fa-sm"></i></button>
                                        </div>
                                    </div>
                                <div class="form-group row">
                                    <label class="col-md-4 col-form-label form-control-label">Nom</label>
                                    <div class="col-md-6">
                                        <input type="text" class="form-control" name="nom" id="nom" placeholder="nom" value="JUSTE" required>
                                    </div>
                                    <div class="col-md-2">
                                        <button class="btn btn-dark"><i class="fa fa-plus fa-sm"></i></button>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-md-4 col-form-label form-control-label">Email</label>
                                    <div class="col-md-6">
                                        <input type="email" class="form-control" name="email" id="email" placeholder="email" value="wood@gmail.com" required>
                                    </div>
                                    <div class="col-md-2">
                                        <button class="btn btn-dark"><i class="fa fa-plus fa-sm"></i></button>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-md-4 col-form-label form-control-label">Téléphone</label>
                                    <div class="col-md-6">
                                        <input type="text" class="form-control" name="numTelephone" id="telephone" placeholder="telephone" value="0564847515" required>
                                    </div>
                                    <div class="col-md-2">
                                        <button class="btn btn-dark"><i class="fa fa-plus fa-sm"></i></button>
                                    </div>
                                </div>
                        </div>
                    </div>

                    <div class="card card-outline-secondary  offset-md-2">
                        <div class="card-header">
                            <h3 class="mb-0">Connexion au compte</h3>
                        </div>
                        <div class="card-body">
                                <div class="form-group row">
                                    <label class="col-md-4 col-form-label form-control-label">Identifiant</label>
                                    <div class="col-md-6">
                                        <input type="email" class="form-control" name="email" id="email" placeholder="email" value="wood@gmail.com" required>
                                    </div>
                                        <div class="col-md-2">
                                            <button class="btn btn-dark"><i class="fa fa-plus fa-sm"></i></button>
                                        </div>
                                    </div>
                                <div class="form-group row">
                                    <label class="col-md-4 col-form-label form-control-label">Mot de passe</label>
                                    <div class="col-md-6">
                                        <input type="password" class="form-control" name="pwd" id="pwd" placeholder="pwd" value="dawan2019" required>
                                    </div>
                                    <div class="col-md-2">
                                        <button class="btn btn-dark"><i class="fa fa-plus fa-sm"></i></button>
                                    </div>
                                </div>
                        </div>
                    </div>
                </div> 

                <div class="row" style="margin-top: 30px">   
                    <div class="card card-outline-secondary">
                        <div class="card-header">
                            <h3 class="mb-0">Adresse de Livraison</h3>
                        </div>
                        <div class="card-body">
                                <div class="form-group row">
                                    <label class="col-md-4 col-form-label form-control-label">Etage</label>
                                    <div class="col-md-6">
                                        <input class="form-control" type="text" name="etage" id="etage" placeholder="etage" value="5" required>
                                    </div>
                                        <div class="col-md-2">
                                            <button class="btn btn-dark"><i class="fa fa-plus fa-sm"></i></button>
                                        </div>
                                    </div>
                                <div class="form-group row">
                                    <label class="col-md-4 col-form-label form-control-label">Numero</label>
                                    <div class="col-md-6">
                                        <input type="text" class="form-control" name="numero" id="numero" placeholder="numero" value="654" required>
                                    </div>
                                    <div class="col-md-2">
                                        <button class="btn btn-dark"><i class="fa fa-plus fa-sm"></i></button>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-md-4 col-form-label form-control-label">Voie</label>
                                    <div class="col-md-6">
                                        <input type="text" class="form-control" name="nomDeVoie" id="email" placeholder="nomDeVoie" value="Avenue" required>
                                    </div>
                                    <div class="col-md-2">
                                        <button class="btn btn-dark"><i class="fa fa-plus fa-sm"></i></button>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-md-4 col-form-label form-control-label">Code postale</label>
                                    <div class="col-md-6">
                                        <input type="text" class="form-control" name="codePostale" id="codePostale" placeholder="codePostale" value="31750" required>
                                    </div>
                                    <div class="col-md-2">
                                        <button class="btn btn-dark"><i class="fa fa-plus fa-sm"></i></button>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-md-4 col-form-label form-control-label">Ville</label>
                                    <div class="col-md-6">
                                        <input type="text" class="form-control" name="ville" id="ville" placeholder="ville" value="Toulouse" required>
                                    </div>
                                    <div class="col-md-2">
                                        <button class="btn btn-dark"><i class="fa fa-plus fa-sm"></i></button>
                                    </div>
                                </div>
                        </div>
                    </div>

                    <div class="card card-outline-secondary offset-md-2">
                        <div class="card-header">
                            <h3 class="mb-0">Adresse de Facturation</h3>
                        </div>
                        <div class="card-body">
                                <div class="form-group row">
                                    <label class="col-md-4 col-form-label form-control-label">Etage</label>
                                    <div class="col-md-6">
                                        <input class="form-control" type="text" name="etage" id="etage" placeholder="etage" value="5" required>
                                    </div>
                                        <div class="col-md-2">
                                            <button class="btn btn-dark"><i class="fa fa-plus fa-sm"></i></button>
                                        </div>
                                    </div>
                                <div class="form-group row">
                                    <label class="col-md-4 col-form-label form-control-label">Numero</label>
                                    <div class="col-md-6">
                                        <input type="text" class="form-control" name="numero" id="numero" placeholder="numero" value="654" required>
                                    </div>
                                    <div class="col-md-2">
                                        <button class="btn btn-dark"><i class="fa fa-plus fa-sm"></i></button>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-md-4 col-form-label form-control-label">Voie</label>
                                    <div class="col-md-6">
                                        <input type="text" class="form-control" name="nomDeVoie" id="email" placeholder="nomDeVoie" value="Avenue" required>
                                    </div>
                                    <div class="col-md-2">
                                        <button class="btn btn-dark"><i class="fa fa-plus fa-sm"></i></button>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-md-4 col-form-label form-control-label">Code postale</label>
                                    <div class="col-md-6">
                                        <input type="text" class="form-control" name="codePostale" id="codePostale" placeholder="codePostale" value="31750" required>
                                    </div>
                                    <div class="col-md-2">
                                        <button class="btn btn-dark"><i class="fa fa-plus fa-sm"></i></button>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-md-4 col-form-label form-control-label">Ville</label>
                                    <div class="col-md-6">
                                        <input type="text" class="form-control" name="ville" id="ville" placeholder="ville" value="Toulouse" required>
                                    </div>
                                    <div class="col-md-2">
                                        <button class="btn btn-dark"><i class="fa fa-plus fa-sm"></i></button>
                                    </div>
                                </div>
                        </div>
                    </div>

                </div>

            </div>
</body>
</html>