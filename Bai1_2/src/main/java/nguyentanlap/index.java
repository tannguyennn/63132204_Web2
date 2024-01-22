package nguyentanlap;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java
.io.*/**
 * Servlet implementation class index
 */
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");
		 
	        PrintWriter out = response.getWriter();
	        String title = "Vi du phuong thuc POST";
	        String docType =
	           "<!doctype html public \"-//w3c//dtd html 4.0 " + 
	           "transitional//en\">\n";
	            
	        out.println(docType +
	           "<html>\n" +
	              "<head><meta charset=\"UTF-8\">\n" +
	              "<title>" + title + "</title></head>\n" +
	              "<body bgcolor = \"#f0f0f0\">\n" +
	                 "<h1 align = \"center\">" + title + "</h1>\n" +
	                 "<ul>\n" +
	                    "  <li><b>First Name</b>: "
	                    + request.getParameter("first_name") + "\n" +
	                    "  <li><b>Last Name</b>: "
	                    + request.getParameter("last_name") + "\n" +
	                 "</ul>\n" +
	              "</body>" + 
	           "</html>"
	        );
	}

}
