<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<form action="LoginServlet" method="post">
    Username:<br/>
    <input type="text" name="username" value="test" /><br/>
    Password:<br/>
    <input type="password" name="pass" value="test"/><br/>
    <input type="submit" value="Login"/>
</form>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>