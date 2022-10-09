package com.burhan.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */

public class ControllerServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RequestDispatcher rd;
		System.out.println("Controller Servlet called...");
		System.out.println(request.getParameter("id"));
//		rd = request.getRequestDispatcher("/index.jsp");
//		rd.forward(request, response);
//		switch(request.getParameter("id")) {
		
//		case "add":
//			rd = request.getRequestDispatcher("/add");
//			//rd.forward(request, response);
//			break;
//		
//		case "sub":
//			
//			rd = request.getRequestDispatcher("/sub");
//			rd.forward(request, response);
//			break;
//		
//		case "mul":
//			
//			rd = request.getRequestDispatcher("/multiply");
//			rd.forward(request, response);
//			break;
//		
//		case "div":
//			
//			rd = request.getRequestDispatcher("/divide");
//			rd.forward(request, response);
//			break;
		
			
//		}
		
	
	}

	
}
