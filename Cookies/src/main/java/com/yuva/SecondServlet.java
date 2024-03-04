package com.yuva;

import java.io.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            Cookie[] ck = request.getCookies();
            if (ck != null && ck.length > 0) {
                out.print("Hello " + ck[0].getValue());
            } else {
                out.print("Cookie not found.");
            }

            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
