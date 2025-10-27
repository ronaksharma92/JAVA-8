import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set response type
        response.setContentType("text/html");

        // Get the PrintWriter object
        PrintWriter out = response.getWriter();

        // Retrieve form data
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Hardcoded validation (you can later replace this with a database check)
        if ("admin".equals(username) && "12345".equals(password)) {
            out.println("<html><body>");
            out.println("<h2>Welcome, " + username + "!</h2>");
            out.println("<p>Login successful.</p>");
            out.println("</body></html>");
        } else {
            out.println("<html><body>");
            out.println("<h3 style='color:red;'>Invalid username or password!</h3>");
            out.println("<a href='login.html'>Try Again</a>");
            out.println("</body></html>");
        }
    }
}
