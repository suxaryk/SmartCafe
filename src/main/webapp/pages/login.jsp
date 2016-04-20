<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login page</title>
    <link href="/static/css/login.css" rel="stylesheet">
    <script src="/static/js/jquery.min.js"></script>
    <script src="static/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">


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
                    <div class="col-xs-2 col-md-2 pull-left">
                        <a href="./home" class="btn btn-large btn-danger  pull-left" role="button">Back</a>
                    </div>
                    <div class="col-xs-6 col-md-6 pull-right">
                        <button type="submit" class="btn btn-large btn-success pull-right">Sign in</button>
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>