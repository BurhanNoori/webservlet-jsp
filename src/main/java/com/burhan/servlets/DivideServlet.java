package com.burhan.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DivideServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		divide(req, res);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		divide(req, res);
	}

	private void divide(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		// TODO Auto-generated method stub
			double num1 = Double.parseDouble(req.getParameter("num1"));
			double num2 = Double.parseDouble(req.getParameter("num2"));
			double result = num1 /  num2;
		
			
			req.setAttribute("result", result);
			RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
			rd.forward(req, res);
	}
}
