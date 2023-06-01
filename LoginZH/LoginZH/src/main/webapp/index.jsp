<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Login</h1>
<br/>
<form action="LoginServlet" method="post">
    Email:<br/>
    <input type="text" name="email" /><br/>
    Password:<br/>
    <input type="password" name="password" /><br/>
    <input type="submit" value="Login"/>
</form>

<a href="Register.jsp">Register</a>
</body>
</html>