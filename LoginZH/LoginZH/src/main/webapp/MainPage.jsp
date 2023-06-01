
<%@ page import="com.example.loginzh.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main Page</title>
</head>
<body>
<%
    if (session.getAttribute("user")==null)
    {
        response.sendRedirect("index.jsp");
    }
%>
<h1>Members</h1>
<%
    User user = (User) session.getAttribute("user");
%>
<p>Hello <%=user.getEmail()%>!</p>

</body>
</html>
