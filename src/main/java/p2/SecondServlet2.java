package p2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/secondServlet2")
public class SecondServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SecondServlet2() {
        super();
    }
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name1 = (String)request.getAttribute("val");
		System.out.println(name1);
		
		HttpSession session = request.getSession();
		String sName = (String)session.getAttribute("sName");
		System.out.println(sName);
		//when servlet runs directly it will print null and value together from get method.
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name1 = (String)request.getAttribute("val");
		System.out.println(name1);
		
		HttpSession session = request.getSession();
		String sName = (String)session.getAttribute("sName");
		System.out.println(sName);
	}

}
