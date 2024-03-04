package com.yuva;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		request.getRequestDispatcher("link.html").include(request, response);
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		if (password.equals("yuva")) {
			out.print("you have sucessfully loggged in !");
			out.print("<br>Welcome," + name);
			Cookie ck = new Cookie("name", name);
			response.addCookie(ck);
		} else {
			out.print("Soory, username or password error!");
			request.getRequestDispatcher("login.html").include(request, response);

		}
		out.close();

	}

}
