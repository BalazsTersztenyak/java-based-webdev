<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Scarif
  Date: 2021. 12. 01.
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Register</h1>

<form:form action="/adduser" method="post" modelAttribute="user">
    Username: <br>
    <form:input path="username"/> <br>
    Password: <br>
    <form:input path="password" type="password"/> <br>
    Address: <br>
    <form:input path="address"/> <br>
    <input type="submit">
</form:form>
</body>
</html>
