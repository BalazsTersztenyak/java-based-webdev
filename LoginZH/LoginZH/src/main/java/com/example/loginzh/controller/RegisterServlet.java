package com.example.loginzh.controller;

import com.example.loginzh.model.User;
import com.example.loginzh.model.UserRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = UserRepository.getInstance().findUser(email);
        if(user!=null)
        {
            request.setAttribute("message", "Email address already registered!");
            request.getRequestDispatcher("Register.jsp").forward(request,response);
        }
        else
        {
            User newUser = new User(email,password);
            UserRepository.getInstance().addUser(newUser);
            request.getSession().setAttribute("user", newUser);
            request.getRequestDispatcher("MainPage.jsp").forward(request, response);
        }
    }
}
