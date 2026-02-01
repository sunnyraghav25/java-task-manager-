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
        out.println("<h1 style='color:green;'>Task Received!</h1>");
        out.println("<p>Aapka task hai: <b>" + taskName + "</b></p>");
        out.println("<br><a href='index.html' style='text-decoration:none; color:blue;'>Wapas Jayein</a>");
        out.println("</div>");
        
    
        System.out.println("New Task added to list: " + taskName);
    }
}