<%--
  Created by IntelliJ IDEA.
  User: sathish
  Date: 3/4/16
  Time: 10:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="/login/authenticate" method="post">
    <input type="email" name="username" class="input-text" placeholder="Email" oninvalid="InvalidMsg(this);"
           required="true"/>
    <input type="password" name="password"  placeholder="Password" style="padding: 10px 10px;"
           required="true"/>

    <div >
        <div>
            <a href="forgot-password"><p>Forgot Your Password?</p></a>
        </div>
        <div></div>
    </div>


        <input type="submit" value="Login"/>
</form>

</body>
</html>
