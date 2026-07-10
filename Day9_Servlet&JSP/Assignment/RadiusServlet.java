package com.coforge.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/RadiusServlet")
public class RadiusServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd =
                request.getRequestDispatcher("AreaServlet");

        rd.forward(request, response);
    }
}