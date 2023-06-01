package com.example.pzh;

import java.io.*;

import com.example.pzh.mymath.MyMath;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "controller", value = "/controller")
public class ControllerServlet extends HttpServlet{

    public ControllerServlet() {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int n = Integer.parseInt(request.getParameter("n"));
        int k = Integer.parseInt(request.getParameter("k"));
        int result = MyMath.bin(n, k);
        if (result == -1){
            request.getSession().setAttribute("incorrect", result);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        request.getSession().setAttribute("incorrect", 0);
        request.getSession().setAttribute("result", result);
        request.getRequestDispatcher("Binom.jsp").forward(request, response);
    }
}
