package com.yuva;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import com.oreilly.servlet.MultipartRequest;

public class UploadServlet extends HttpServlet {
  
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
          
        // Specify the upload directory - change this path as needed
        String uploadDirectory = "D:/uploads";
        
        // Create the upload directory if it doesn't exist
        File uploadDir = new File(uploadDirectory);
        if (!uploadDir.exists()) {
            uploadDir.mkdirs();
        }
        
        // Check if the directory is writable
        if (!uploadDir.canWrite()) {
            out.println("Upload directory is not writable.");
            return;
        }

        // Handle file upload
        try {
            MultipartRequest m = new MultipartRequest(request, uploadDirectory);
            out.println("Successfully uploaded file.");
        } catch (IOException e) {
            out.println("Error uploading file: " + e.getMessage());
        }
    }
}
