<%@ page import="com.example.forumzh.Model.Forum" %>
<%@ page import="com.example.forumzh.Model.Comment" %>
<%@ page import="com.example.forumzh.Model.ForumRepo" %>
<%@ page import="com.example.forumzh.Model.User" %><%--
  Created by IntelliJ IDEA.
  User: aronf
  Date: 09/12/2021
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Forum forum = (Forum) request.getServletContext().getAttribute("forum");
%>
<h4>Bejelentkezve mint: <%= request.getSession().getAttribute("user").toString()%></h4>
    <table>
        <tr>
            <th>Comment</th>
            <th>Author</th>
        </tr>
        <%for (Comment c : forum.getComments()) {%>
        <tr>
            <td><%=c.getContent()%></td>
            <td><%=forum.findUserById(c.getAuthorId())%></td>
        </tr>
        <%}%>
    </table>

<h2>Add a new comment:</h2>
<form method="post" action="AddCommentServlet">
    Comment: <input type="text" name="comment"/><br/>
    <input type="submit" value="Post"/>
</form>


</body>
</html>
