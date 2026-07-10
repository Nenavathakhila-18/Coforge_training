package com.coforge.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals("admin") && password.equals("123")) {
			// out.println("<font color ='green'><b>Welcome Admin</b></font>");
			
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			
			Cookie cookie = new Cookie("username",username);
			response.addCookie(cookie);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("LoginSuccess.jsp");
			dispatcher.forward(request, response);
			
			//response.sendRedirect("LoginSuccess.jsp");
		} else {
			// out.println("<font color ='red'><b>Invalid Username or password </b></font>");
			response.sendRedirect("LoginFail.jsp");
		}
		
		out.close();		
	}

}
