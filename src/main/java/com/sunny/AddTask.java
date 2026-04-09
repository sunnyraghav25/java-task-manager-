package com.sunny; 

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/AddTask")
public class AddTask extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String taskName = request.getParameter("t1");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<div style='text-align:center; margin-top:50px; font-family:sans-serif;'>");
        out.println("<h2>Task Added Successfully: " + taskName + "</h2>");
        out.println("</div>");
    }
}
