
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

public class HelloWorld extends HttpServlet {
  
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<!DOCTYPE><html><head><title>HelloWorld Servlet</title></head>");
        writer.println("<body><h3> Welcome to ideas2it</h3></body></html>");
        String firstName = request.getParameter("firstName");  
        String lastName = request.getParameter("lastName");  
        writer.println(firstName);
        writer.println(lastName);

    }
}