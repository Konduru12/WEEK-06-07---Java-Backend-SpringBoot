package jakarta.example;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello from Tomcat 10!</h1>");
    }
}