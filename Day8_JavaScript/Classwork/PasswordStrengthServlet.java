package com.coforge.servelet.ajax;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class PasswordStrengthServlet
 */
@WebServlet("/PasswordStrengthServlet")
public class PasswordStrengthServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String password = request.getParameter("pwd");
		if(password!=null && password.length()<3) {
			out.println("<font color = 'red'><b>WEAK</b></font>");
		}
		
		if(password!=null && password.length()>3 && password.length()<6) {
			out.println("<font color = 'orange'><b>GOOD</b></font>");
		}
		if(password!=null && password.length()>6) {
			out.println("<font color = 'green'><b>STRONG</b></font>");
		}
		out.close();
	}

}
