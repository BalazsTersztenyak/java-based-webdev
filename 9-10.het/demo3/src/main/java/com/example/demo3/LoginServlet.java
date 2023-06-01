package com.example.demo3;

import Model.User;
import Repository.Repo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nev = request.getParameter("username");
        if (!nev.isEmpty()) {
            User user = Repo.GetInstance().getUserByUsername(nev);
            if (user != null) {
                if (user.isPasswordCorrect(request.getParameter("pass"))) {
                    //ha minden megfelel (jelszó, felhasználónév)
                    request.getSession().setAttribute("user", user); //lekérjük a sessiont
                    request.getRequestDispatcher("LogedIn.jsp").forward(request, response); // továbbítjuk a dolgokat a jsp-nek
                }
            }
        }
        request.getRequestDispatcher("Register.jsp").forward(request, response);// továbbítjuk a dolgokat a jsp-nek
    }
}
