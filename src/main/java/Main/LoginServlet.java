package Main;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import database.DataBaseConnection;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            Users user = new Users();
            boolean good = user.Valid(username, password);
            
            response.setContentType("text/html"); // printing it in HTML format
            PrintWriter out = response.getWriter();
            
            if (good) 
            {
                // go to welcome page and print message
                out.println("<h2>Welcome, " + user.getFirstName() + "!</h2>");
                response.sendRedirect("welcome.jsp");
            } else 
            {
                // login error and print message
                out.println("<h2>Invalid credentials. Please try again.</h2>");
                response.sendRedirect("login.jsp?error=Invalid credentials");
            }
            out.close();
        } 
}