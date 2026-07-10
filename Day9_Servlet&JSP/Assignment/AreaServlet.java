package com.coforge.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/AreaServlet")
public class AreaServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        double radius =
                Double.parseDouble(request.getParameter("radius"));

        double area = Math.PI * radius * radius;

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<h2>Area of Circle</h2>");
        out.println("Radius : " + radius + "<br>");
        out.println("Area : " + area);
        out.println("</body>");
        out.println("</html>");

        out.close();
    }
}