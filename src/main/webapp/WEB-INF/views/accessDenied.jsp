<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    Dear <strong>${user}</strong>, You are not authorized to access this page
    <a href="<c:url value="/logout" />">Logout</a>
</head>
<body>

</body>
</html>
