<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="true" %>

<!DOCTYPE html>

<head> 
    <title>Login/Register Form</title>
</head>
<body>
    <div id="logreg-forms">
    
        <!-- formulaire pour login -->
        <form:form class="form-signin" method="post" action="checkLogin" modelAttribute="user-form">
        
            <h1 class="h3 mb-3 font-weight-normal" style="text-align: center"> Sign in</h1>
            
            <!-- TODO: se connecter via Facebook ou Google+ -->
            <div class="social-login">
                <form:button class="btn facebook-btn social-btn" type="button"><span><i class="fab fa-facebook-f"></i> Sign in with Facebook</span> </form:button>
                <form:button class="btn google-btn social-btn" type="button"><span><i class="fab fa-google-plus-g"></i> Sign in with Google+</span> </form:button>
            </div>
            
            <p style="text-align:center"> OR  </p>
          
          
            <!-- TODO: faut "form:" ou pas? -->
            <select name="statut" id="statut-select" class="form-control">
            <option value="" disabled selected style="display:none">Merci de choisir votre statut</option>
            <option value="client">client</option>
            <option value="commercant">commercant</option>
            <option value="admin">admin</option>
            <option value="livreur">livreur</option>
            </select> 
            
            
            
            <!-- TODO:path="email/pwd" doit correspondre le nom exact des attributs dans la classe "Client" (chercher solution pour Utilisateur) -->
            <form:input path="email" type="email" id="inputEmail" class="form-control" placeholder="Email address" required="true" autofocus=""/>
            <form:input path="pwd" type="password" id="inputPassword" class="form-control" placeholder="Password" required="true"/>
          
            <form:button class="btn btn-success btn-block" type="submit"><i class="fas fa-sign-in-alt"></i> Sign in</form:button>
            
            <!-- TODO: forget password à faire -->
            <a href="#" id="forgot_pswd">Forgot password?</a>
            <hr>
            
            <!-- <p>Don't have an account!</p>  -->
            <!-- TODO: page inscription à faire -->
            <form:button class="btn btn-primary btn-block" type="button" id="btn-signup"><i class="fas fa-user-plus"></i> Sign up New Account</form:button>
        </form:form>


        <!-- TODO: tout le rest de cette page -->
        <form action="/reset/password/" class="form-reset">
                <input type="email" id="resetEmail" class="form-control" placeholder="Email address" required="" autofocus="">
                <button class="btn btn-primary btn-block" type="submit">Reset Password</button>
                <a href="#" id="cancel_reset"><i class="fas fa-angle-left"></i> Back</a>
            </form>
            
            <form action="/signup/" class="form-signup">
                <div class="social-login">
                    <button class="btn facebook-btn social-btn" type="button"><span><i class="fab fa-facebook-f"></i> Sign up with Facebook</span> </button>
                </div>
                <div class="social-login">
                    <button class="btn google-btn social-btn" type="button"><span><i class="fab fa-google-plus-g"></i> Sign up with Google+</span> </button>
                </div>
                
                <p style="text-align:center">OR</p>

                <!-- TODO: faut "form:" ou pas? -->
            <select name="statut" id="statut-select" class="form-control">
            <option value="" disabled selected style="display:none">Merci de choisir votre statut</option>
            <option value="client">client</option>
            <option value="commercant">commercant</option>
            <option value="admin">admin</option>
            <option value="livreur">livreur</option>
            </select> 
            
                <input type="text" id="user-name" class="form-control" placeholder="Full name" required="" autofocus="">
                <input type="email" id="user-email" class="form-control" placeholder="Email address" required autofocus="">
                <input type="password" id="user-pass" class="form-control" placeholder="Password" required autofocus="">
                <input type="password" id="user-repeatpass" class="form-control" placeholder="Repeat Password" required autofocus="">

                <button class="btn btn-primary btn-block" type="submit"><i class="fas fa-user-plus"></i> Sign Up</button>
                <a href="#" id="cancel_signup"><i class="fas fa-angle-left"></i> Back</a>
            </form>   
            <br>
            
    </div>
    
    <p>${msg}</p>
    
</body>
</html>