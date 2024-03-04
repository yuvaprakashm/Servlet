package com.yuva;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ServletDownload extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("application/octet-stream");
        PrintWriter out = response.getWriter();
        String filename = "ANR Software.csv";
        String filepath = "D:\\"; 
        response.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");

        FileInputStream fileInputStream = new FileInputStream(filepath + filename);

        int i;
        while ((i = fileInputStream.read()) != -1) {
            out.write(i);
        }
        fileInputStream.close();
        out.close();
    }

}
