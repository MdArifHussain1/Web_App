package com.web_app_2.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web_app_2.model.Add;


@WebServlet("/controller")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AddController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	                                
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		Add a1 = new Add();
		int val = a1.addNumbers(num1, num2);
		
		request.setAttribute("result", val);
		
		RequestDispatcher rd = request.getRequestDispatcher("add_numbers.jsp");
		rd.forward(request, response);
		
	}

}
