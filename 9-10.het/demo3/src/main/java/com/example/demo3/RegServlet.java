package com.example.demo3;

import Model.User;
import Repository.Repo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "RegServlet", value = "/RegServlet")
public class RegServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("username") != null)
            if (request.getParameter("pass") != null) {
                User user = new User(request.getParameter("username")
                        , request.getParameter("pass")
                        , "", "");
                Repo.GetInstance().AddUser(user);
                request.getSession().setAttribute("user",user);
                request.getRequestDispatcher("LogedIn.jsp").forward(request,response);
            }
    }
}
