package com.web_app_2.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web_app_2.model.MultiplyNumbers;

@WebServlet("/multiplyNum")
public class MultiplyNum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MultiplyNum() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		MultiplyNumbers m1=new MultiplyNumbers();
		int val = m1.multiplication(num1, num2);
		
		request.setAttribute("result", val);
		RequestDispatcher rd = request.getRequestDispatcher("MultiplyNumbers.jsp");
		rd.forward(request, response);
		
		
		
		
		
	}

}
