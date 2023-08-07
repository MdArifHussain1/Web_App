package p2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/firstServlet2")
public class FirstServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public FirstServlet2() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("from get method first servlet");
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		//request.setAttribute("val", name);
		
		HttpSession session = request.getSession();
		session.setAttribute("sName", name);
		
		RequestDispatcher rd = request.getRequestDispatcher("secondServlet2");
		rd.forward(request, response);
		
	}

}
