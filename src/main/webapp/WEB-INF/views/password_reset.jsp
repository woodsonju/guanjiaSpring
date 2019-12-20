<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="true" %>

<!DOCTYPE html>

<head> 
	<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>Login/Register Form</title>
    <base href="<%=request.getScheme()+"://"+request.getServerName()
        +":"+request.getServerPort() + request.getContextPath() + "/"%>" />
</head>
<body>


<div class="container" style="margin-top: 70px; margin-bottom: 70px; mx-auto">
	<div class="row d-flex justify-content-center">
		<div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
            <div class="card" style="width: 30rem; height: 30rem; ">
              <div class="card-body">
                <div class="text-center">
                  <h3><i class="fa fa-user fa-4x"></i></h3>
                  <h4 class="text-center">Création d'un nouveau mot de passe utilisateur</h4>
                  <p></p>
                  <div class="card-body">
    
                    <form:form class="form" id="register-form1" role="form" method="post" action="creer-mot-de-passe"  modelAttribute="utilisateur-resetpassword" autocomplete="off">
                      <div class="input-group input-group-lg mb-3">
					    <div class="input-group-prepend">
					        <span class="input-group-text">
					            <i class="fa fa-lock"></i>
					        </span>
					    </div>
                        <form:input id="inputPassword1" path="pwd" placeholder="Mot de passe" class="form-control"  type="password"/>
						<form:errors path="pwd" cssClass="error" cssStyle="color:#F52508"/>
					</div>
					
					 <div class="input-group input-group-lg mb-3">
					    <div class="input-group-prepend">
					        <span class="input-group-text">
					            <i class="fa fa-unlock-alt"></i>
					        </span>
					    </div>
                        <form:input id="inputPassword2" path="pwd" placeholder="Confirmation de mot de passe" class="form-control"  type="password"/>
						<form:errors path="pwd" cssClass="error" cssStyle="color:#F52508"/>
					</div>
					
                      <div class="form-group">
                      <button type="submit" class="btn btn-md btn-primary btn-block">Enregistrer</button>
                        <!-- <input name="recover-submit" class="btn btn-md btn-primary btn-block" value="Valider" type="submit"> -->
                      </div>
                      
                      <input type="hidden" class="hide" name="token" id="token" value=""> 
                    </form:form>
    
                  </div>
                </div>
              </div>
            </div>
          </div>
	</div>
</div>

</body>