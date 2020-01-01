<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="true" %>

<%-- <!DOCTYPE html>

<head> 
	<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>Login/Register Form</title>
    <base href="<%=request.getScheme()+"://"+request.getServerName()
        +":"+request.getServerPort() + request.getContextPath() + "/"%>" />
</head> --%>
<body>


<div class="container" style="margin-top: 70px; margin-bottom: 70px; mx-auto">
	<div class="row d-flex justify-content-center">
		<div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
            <div class="card" style="width: 30rem; height: 30rem; ">
              <div class="card-body">
                <div class="text-center">
                  <h3><i class="fa fa-lock fa-4x"></i></h3>
                  <h4 class="text-center">VOUS AVEZ OUBLIÉ VOTRE MOT DE PASSE?</h4>
                  <p>Si vous avez oublié votre mot de passe, merci de saisir l'adresse e-mail associée à votre compte Guanjia.<br>
                   Nous vous enverrons un mail à cette adresse contenant un lien vous permettant d'en créer un nouveau.</p>
                  <div class="card-body">
    
                    <form:form id="register-form" role="form"  class="form" method="post" action="mot-de-passe-oublie" modelAttribute="utilisateur-sendmailforpwd" autocomplete="off">
	                    <div class="input-group input-group-lg mb-3">
						    <div class="input-group-prepend">
						        <span class="input-group-text">
						            <i class="fa fa-envelope-o fa_custom fa"></i>
						        </span>
						    </div>
	                        <form:input path="email" id="email"  placeholder="email address" class="form-control"  type="email"/>
							<form:errors path="email" cssClass="error" cssStyle="color:#F52508"/>
						</div>
	            
	                     <div class="form-group">
							<button type="submit" class="btn btn-md btn-primary btn-block">Valider</button>
						</div>
	                      
<!-- 	                      <input type="hidden" class="hide" name="token" id="token" value=""> 
 -->                    
					 </form:form>
    
                  </div>
                </div>
              </div>
            </div>
          </div>
	</div>
</div>

</body>