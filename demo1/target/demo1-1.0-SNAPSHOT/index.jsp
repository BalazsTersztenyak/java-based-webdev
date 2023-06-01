<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%
    if (request.getParameter("login")!=null){
        getServletContext().setAttribute("loginType", "login");
    }
%>

<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<form action="" method="post" name="login">
    <h1>Login</h1>
    Email:<input type="text" name="email"><br>
    Password:<input type="password" name="password"><br>
    <input type="submit" value="Login">
</form>
<form action="" method="post" name="guest">
    <h1>Guest</h1>
    Email:<input type="text" name="email"><br>
    <input type="submit" value="Login">
</form>
</body>
</html>