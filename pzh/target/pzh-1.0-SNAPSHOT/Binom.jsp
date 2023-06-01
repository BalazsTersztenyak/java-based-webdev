<%@ page import="com.example.pzh.mymath.MyMath" %><%--
  Created by IntelliJ IDEA.
  User: Balu
  Date: 2021. 12. 10.
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<%
    //session =
    int n = Integer.parseInt(request.getParameter("n"));
    int k = Integer.parseInt(request.getParameter("k"));
    int lastResult = -1;
    if (request.getSession().getAttribute("lastResult") != null) {
        lastResult = Integer.parseInt(request.getSession().getAttribute("lastResult").toString());
    }
    int visits = 1;
    if (request.getServletContext().getAttribute("visits") != null) {
        visits = Integer.parseInt(request.getServletContext().getAttribute("visits").toString());
    }
    int result = MyMath.bin(n, k);
%>
<h2>(<%=n%> <%=k%>) is: <%=result%></h2><br>
My previous result: <%=lastResult%><br>
All visits: <%=visits%>
<%
    lastResult = result;
    request.getSession().setAttribute("lastResult", lastResult);
    visits++;
    request.getServletContext().setAttribute("visits", visits);
%>
<br>
<a href="index.jsp">Back</a>
</body>
</html>
