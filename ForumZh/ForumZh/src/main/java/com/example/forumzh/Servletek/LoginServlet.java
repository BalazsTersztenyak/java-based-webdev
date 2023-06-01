package com.example.forumzh.Servletek;

import com.example.forumzh.Model.Comment;
import com.example.forumzh.Model.Forum;
import com.example.forumzh.Model.ForumRepo;
import com.example.forumzh.Model.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nick = request.getParameter("nick");
        String password = request.getParameter("password");
        User user = ForumRepo.getInstance().findUser(nick);
        if (user != null){
            request.getSession().setAttribute("user", user);
            if (user.isPasswordCorrect(password)){
                if (request.getServletContext().getAttribute("forum") == null) {
                    request.getServletContext().setAttribute("forum", new Forum());
                }
                request.getRequestDispatcher("MainPage.jsp").forward(request, response);
            }
            else{
                request.getRequestDispatcher("incorrect_password.html").forward(request, response);
            }
        }
    }
}
