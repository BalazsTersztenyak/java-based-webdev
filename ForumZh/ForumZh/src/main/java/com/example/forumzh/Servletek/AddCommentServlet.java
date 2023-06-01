package com.example.forumzh.Servletek;

import com.example.forumzh.Model.Comment;
import com.example.forumzh.Model.Forum;
import com.example.forumzh.Model.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "AddCommentServlet", value = "/AddCommentServlet")
public class AddCommentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String comment = request.getParameter("comment");

            User user = (User) request.getSession().getAttribute("user");
            Forum f = (Forum) request.getServletContext().getAttribute("forum");
            f.addComment(new Comment(comment, user.getId()));

            request.getRequestDispatcher("MainPage.jsp").forward(request, response);
    }
}
