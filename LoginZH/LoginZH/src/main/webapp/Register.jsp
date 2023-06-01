
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<h1>Register</h1><br/>
<% if (request.getAttribute("message")!=null){%>
<p><%=request.getAttribute("message")%></p>
<%}%>
<form action="RegisterServlet" method="post">
    Email:<br/>
    <input type="text" name="email" /><br/>
    Password:<br/>
    <input type="password" name="password" /><br/>
    <input type="submit" value="Register"/>
</form>

</body>
</html>
