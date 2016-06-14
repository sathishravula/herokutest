<%--
  Created by IntelliJ IDEA.
  User: sathish
  Date: 3/4/16
  Time: 10:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <title></title>
</head>
<body>
<h1>hello User
    <sec:authentication property="principal.username" /></h1>

</body>
</html>
