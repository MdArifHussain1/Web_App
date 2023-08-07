package p2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/secondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SecondServlet() {
        super();
    }
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = (String)request.getAttribute("val");		
		System.out.println(name);
		
		HttpSession session = request.getSession();
		String sessionName = (String)session.getAttribute("sessionName");
		System.out.println(sessionName);
		//when servlet runs directly it will print null and value from get method.
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = (String)request.getAttribute("val");		
		System.out.println(name);
		
		HttpSession session = request.getSession();
		String sessionName = (String)session.getAttribute("sessionName");
		System.out.println(sessionName);
	}

}
