package nguyentanlap;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;
/**
 * Servlet implementation class BMI
 */
public class BMI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BMI() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        String noidung = "<form method = POST action=\"/Bai1_4_BMI/BMI\""
        		+ " <label>Chiều cao (cm):</label>"
        		+ "<input type=\"text\" name=\"height\"><br>"
        		+ "<label>Cân nặng (kg):</label>"
        		+ "<input type=\"text\" name=\"weight\"><br>"
        		+ "<input type=\"submit\" value=\"Tính BMI\">"
        		+ "</form>" ;
        out.append(noidung);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
        String heightStr = request.getParameter("height");
        String weightStr = request.getParameter("weight");
        
        float height = Float.parseFloat(heightStr)/100;
        float weight = Float.parseFloat(weightStr);
        float bmi = weight/((height*height));
        
        PrintWriter out = response.getWriter();
        out.append("<html>");
        out.append("<head><title>BMI Result</title></head>");
        out.append("<body>");
        out.append("<h2>Kết quả BMI: "+ Float.toString(bmi) + "</h2>");
        out.append("</body>");
        out.append("</html>");
	}

}
