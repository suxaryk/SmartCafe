<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Authentication</title>
    <link href="/static/css/login.css" rel="stylesheet">
    <link href="/static/css/font-awesome.css" rel="stylesheet">
    <link href="/static/css/bootstrap.css" rel="stylesheet">

</head>

<body>
    <div class="container" align="center">
        <div class="row">

            <form class="form-signin mg-btm" action="${loginUrl}" method="post" class="form-signin">
                <h3 class="heading-desc" align="center">
                    Admin Login</h3>

                <div class="main">
                    <c:url var="loginUrl" value="/login"/>
                    <c:if test="${param.error != null}">
                        <div class="alert alert-danger">
                            <p>Invalid username and password.</p>
                        </div>
                    </c:if>
                    <c:if test="${param.logout != null}">
                        <div class="alert alert-success">
                            <p>You have been logged out successfully.</p>
                        </div>
                    </c:if>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                        <input type="text" class="form-control" id="username" name="ssoId" placeholder="Username"
                               required autofocus>
                    </div>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                        <input type="password" class="form-control" id="password" name="password"
                               placeholder="Password" required>
                    </div>
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

                    <div class="row">
                        <div class="col-xs-6 col-md-6 pull-right">
                            <button type="submit" class="btn btn-lg btn-primary pull-right">
                                <i class="fa fa-sign-in">  Sign in</i>
                            </button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>

    <script src="/static/js/jquery.min.js"></script>
    <script src="/static/js/bootstrap.js"></script>
</body>
</html>