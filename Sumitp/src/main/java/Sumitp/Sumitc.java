package Sumitp;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Sumitc extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String Name = req.getParameter("uname");
	        String Age = req.getParameter("age");
	        String Mail = req.getParameter("mail");
	        String Location = req.getParameter("location");
	        String Country = req.getParameter("country");
	        String State = req.getParameter("state");
	        
	        resp.setContentType("text/html");
	        
	        PrintWriter sumit = resp.getWriter();
	        
	        sumit.println("<html><body>");
	        sumit.println("<h1>My Form Data</h1>");
	        sumit.println("<p>Name: " + Name + "</p>");
	        sumit.println("<p>Age: " + Age + "</p>");
	        sumit.println("<p>Mail: " + Mail + "</p>");
	        sumit.println("<p>Location: " + Location + "</p>");
	        sumit.println("<p>Country: " + Country + "</p>");
	        sumit.println("<p>State: " + State + "</p>");
	        sumit.println("</body></html>");
	        
	        sumit.close();
		
		
	}

}
