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
<form method="post" action="LoginServlet">
    Nickname:<input type="text" name="nick"/><br/>
    Password:<input type="password" name="password"/>
    <input type="submit" value="Sign in">
</body>
</html>