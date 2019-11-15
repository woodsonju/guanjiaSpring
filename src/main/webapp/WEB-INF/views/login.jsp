<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<!DOCTYPE html>

<head> 
    <title>Bootstrap 4 Login/Register Form</title>
</head>
<body>
    <div id="logreg-forms">
    
        <!-- formulaire pour login -->
        <form:form class="form-signin" method="post" action="checkLogin" modelAttribute="user-form">
        
            <h1 class="h3 mb-3 font-weight-normal" style="text-align: center"> Sign in</h1>
            <form:input path="email" type="email" id="inputEmail" class="form-control" placeholder="Email address" required="" autofocus=""/>
            <form:input path="pwd" type="password" id="inputPassword" class="form-control" placeholder="Password" required=""/>
          
            <form:button class="btn btn-success btn-block" type="submit"><i class="fas fa-sign-in-alt"></i> Sign in</form:button>
            <%-- <form:a href="#" id="forgot_pswd">Forgot password?</form:a>
            <hr> --%>
            <!-- <p>Don't have an account!</p>  -->
            <%-- <form:button class="btn btn-primary btn-block" type="button" id="btn-signup"><i class="fas fa-user-plus"></i> Sign up New Account</form:button> --%>
        </form:form>




       <%--  <form:form action="/reset/password/" class="form-reset">
                <form:input type="email" id="resetEmail" class="form-control" placeholder="Email address" required="" autofocus=""/>
                <form:button class="btn btn-primary btn-block" type="submit">Reset Password</form:button>
                <form:a href="#" id="cancel_reset"><i class="fas fa-angle-left"></i> Back</form:a>
        </form:form>
            
            <form:form action="/signup/" class="form-signup">
                <div class="social-login">
                    <form:button class="btn facebook-btn social-btn" type="button"><span><i class="fab fa-facebook-f"></i> Sign up with Facebook</span> </form:button>
                </div>
                <div class="social-login">
                    <form:button class="btn google-btn social-btn" type="button"><span><i class="fab fa-google-plus-g"></i> Sign up with Google+</span> </form:button>
                </div>
                
                <p style="text-align:center">OR</p>

                <form:input type="text" id="user-name" class="form-control" placeholder="Full name" required="" autofocus=""/>
                <form:input type="email" id="user-email" class="form-control" placeholder="Email address" required autofocus=""/>
                <form:input type="password" id="user-pass" class="form-control" placeholder="Password" required autofocus=""/>
                <form:input type="password" id="user-repeatpass" class="form-control" placeholder="Repeat Password" required autofocus=""/>

                <form:button class="btn btn-primary btn-block" type="submit"><i class="fas fa-user-plus"></i> Sign Up</form:button>
                <form:a href="#" id="cancel_signup"><i class="fas fa-angle-left"></i> Back</form:a>
            </form:form> --%>
            <br>
            
    </div>
    
</body>
</html>