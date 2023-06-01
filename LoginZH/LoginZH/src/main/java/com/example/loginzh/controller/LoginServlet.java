package com.example.loginzh.controller;

import com.example.loginzh.model.User;
import com.example.loginzh.model.UserRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (getServletContext().getAttribute("users") == null)
        {
            getServletContext().setAttribute("users", UserRepository.getInstance());
        }

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = UserRepository.getInstance().findUser(email);
        if (user==null)
        {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        else
        {
            if (user.passwordIsEqual(password))
            {
                request.getSession().setAttribute("user", user);
                user.addLogin();
                request.getRequestDispatcher("MainPage.jsp").forward(request,response);
            }
            else
            {
                request.getRequestDispatcher("WrongPassword.jsp").forward(request,response);
            }
        }
    }
}
