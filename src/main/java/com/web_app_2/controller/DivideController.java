package com.web_app_2.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web_app_2.model.DivideNumbers;

@WebServlet("/divideController")
public class DivideController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public DivideController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		DivideNumbers d1=new DivideNumbers();
		int division = d1.division(num1, num2);
		
		request.setAttribute("val", division);
		RequestDispatcher rd = request.getRequestDispatcher("DivideNumbers.jsp");
		rd.forward(request, response);
		
		
		
		
	}

}
