package com.burhan.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	//This is a general method for get and post request. You can specifically write for get and post request
	/*public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int result = num1+num2;
		System.out.println(result);
		PrintWriter out = res.getWriter();
		out.println(result);

	}*/
	
	//GET Request
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		add(req, res);
	}
	
	//POST Request
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		add(req, res);
	}

	
	private void add(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		// TODO Auto-generated method stub
		double num1 = Double.parseDouble(req.getParameter("num1"));
		double num2 = Double.parseDouble(req.getParameter("num2"));
		double result = num1+num2;
		
		
		req.setAttribute("result", result);
		RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		rd.forward(req, res);
	}
	
	

}
