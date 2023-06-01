<%@ page import="Model.User" %><%--
  Created by IntelliJ IDEA.
  User: TotableGabsz
  Date: 2021. 11. 08.
  Time: 8:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    User user = (User)request.getSession().getAttribute("user");
%>
<html>
<head>
    <title>Title</title>
</head>
<h1>Hello: <%=user.getUsername()%></h1>
<body>

</body>
</html>
