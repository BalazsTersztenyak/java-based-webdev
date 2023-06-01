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
<a href="hello-servlet">Hello Servlet</a>

<% if (request.getSession().getAttribute("incorrect") !=null && Integer.parseInt(request.getSession().getAttribute("incorrect").toString()) == -1){%>
<p>Values must be between 0 and 15</p>
<%}%>

<h1>Binomial coefficient of:</h1><br>
<form action="controller" name="binom" method="get">
    n<input type="number" name="n"><br>
    k<input type="number" name="k"><br>
    <input type="submit" value="Show result">
</form>
</body>
</html>