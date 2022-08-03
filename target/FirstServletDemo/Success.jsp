<%--
  Created by IntelliJ IDEA.
  User: AVANI
  Date: 03-08-2022
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Successfull!!</title>
</head>
<body>
    <h3>Hi <%=request.getAttribute("user")%>Login was successfull.</h3>
    <a href="/Login.html">Login Page</a>
</body>
</html>
