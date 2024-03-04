package com.yuva;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletConfig;
import javax.servlet.Servlet;

public class First implements Servlet {
    ServletConfig config=null;

    public void init(ServletConfig config) {
        this.config = config;
        System.out.println("Servlet is initialized");
    }

    public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("<html><body>");
        out.print("<b>Hello simple servlet</b>");
        out.print("</body></html>");
    }

    public void destroy() {
        System.out.println("Servlet is destroyed");
    }

    public ServletConfig getServletConfig() {
        return config;
    }

    public String getServletInfo() {
        return "Copyright 2007-2010";
    }
}
