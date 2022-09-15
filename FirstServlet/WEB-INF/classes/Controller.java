import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

public class Controller extends HttpServlet {

    StudentDao studentDao = new StudentDao();
  
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setIntHeader("Refresh", 20);
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<!DOCTYPE><html><head><title>Student Management</title></head>");
        writer.println("<body><h3> Student portal</h3></body></html>");
        String firstName = request.getParameter("firstName");  
        String lastName = request.getParameter("lastName");   
        writer.println(firstName);
        writer.println(lastName);     
        Student student = new Student(firstName, lastName);
        writer.println(student.getFirstName() + student.getLastName());
        int id = studentDao.insertStudent(student);
        writer.println(id);
    }
}