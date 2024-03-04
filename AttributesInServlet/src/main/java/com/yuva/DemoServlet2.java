package com.yuva;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DemoServlet2 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();

            ServletContext context = getServletContext();
            String n = (String) context.getAttribute("company");

            out.println("Welcome to " + n);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
