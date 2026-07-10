package com.coforge.servelet.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EmailCheckServlet")
public class EmailCheckServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        String email = request.getParameter("email");

        if (email != null && email.equals("akhila@gmail.com")) {
            out.println("<font color='green'><b>Valid</b></font>");
        } else {
            out.println("<font color='red'><b>Not Valid</b></font>");
        }
        out.close();
    }
}