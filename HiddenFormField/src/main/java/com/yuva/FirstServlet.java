package com.yuva;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {
			 response.setContentType("text/html");
			 PrintWriter out = response.getWriter();
			 
			 String n = request.getParameter("username");
			 out.print("Welcome "+n);
			 //creating form that have invisible textfield   
		        out.print("<form action='Servlet2'>");  
		        out.print("<input type='hidden' name='uname' value='"+n+"'>");  
		        out.print("<input type='submit' value='go'>");  
		        out.print("</form>");  
		        out.close();  
		  
		                }catch(Exception e){System.out.println(e);}  
		    }  
		  
		}  
 
