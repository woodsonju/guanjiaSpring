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
            <div class="card" style="width: 20rem; height: 25rem; ">
              <div class="card-body">
                <div class="text-center">
                  <h3><i class="fa fa-lock fa-4x"></i></h3>
                  <h2 class="text-center">Forgot Password?</h2>
                  <p>You can reset your password here.</p>
                  <div class="card-body">
    
                    <form:form id="register-form" role="form" autocomplete="off" class="form" method="post" action="forgot">
                      <div class="input-group input-group-lg mb-3">
					    <div class="input-group-prepend">
					        <span class="input-group-text">
					            <i class="fa fa-envelope-o fa_custom fa"></i>
					        </span>
					    </div>
                        <input id="email" name="email" placeholder="email address" class="form-control"  type="email">
					</div>
                      <div class="form-group">
                        <input name="recover-submit" class="btn btn-md btn-primary btn-block" value="Reset Password" type="submit">
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