<%@ page import="com.example.demo.Model.User" %><%--
  Created by IntelliJ IDEA.
  User: Scarif
  Date: 2021. 12. 01.
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    User user = (User) session.getAttribute("user");
%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Main</h1>
<h2>Hello: <%=user.getUsername()%></h2>
<h2>Hello: ${user.username}</h2>
</body>
</html>
