package com.web_app_2.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web_app_2.model.Subtract;

@WebServlet("/scontroller")
public class SubtractController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SubtractController() {
        super();

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		Subtract a1=new Subtract();
		int subtract = a1.subtractNumbers(num1, num2);
		
		request.setAttribute("val", subtract);
		RequestDispatcher rd = request.getRequestDispatcher("subtract_numbers.jsp");
		rd.forward(request, response);
		
	}

}
