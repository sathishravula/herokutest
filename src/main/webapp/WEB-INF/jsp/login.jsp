<%--
  Created by IntelliJ IDEA.
  User: sathish
  Date: 3/4/16
  Time: 10:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title></title>
</head>
<body>
<form role="form" action="/login" method="post">

    <div>
        <label for="email">Email address</label>
        <input type="email" name="email" id="email" required autofocus>
    </div>
    <div>
        <label for="password">Password</label>
        <input type="password" name="password" id="password" required>
    </div>
    <div>
        <label for="remember-me">Remember me</label>
        <input type="checkbox" name="remember-me" id="remember-me">
    </div>
    <button type="submit">Sign in</button>
</form>

<c:if test="${error.isPresent()}">
    <p>The email or password you have entered is invalid, try again.</p>
</c:if>



</body>
</html>
