package com.arman.jee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Arman on 2017-05-07.
 */

//Java Platform, Enterprise Edition (Java EE) JEE6
//Servlet is a Java programming language class
//used to extend the capabilities of servers
//that host applications accessed by means of
//a request-response programming model.

//@WebServlet(urlPatterns = "/login")
//public class LoginServlet extends HttpServlet {
//	private  UserValidationService userValidationService = new UserValidationService();
//
//	@Override
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//		request.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(request, response);
//	}
//
//	@Override
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//		if(userValidationService.isUserValid(request.getParameter("name"), request.getParameter("password"))){
//			request.setAttribute("name", request.getParameter("name"));
//			request.getRequestDispatcher("WEB-INF/jsp/welcome.jsp").forward(request, response);
//		} else {
//			request.setAttribute("error", "wrong username or password!");
//			request.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(request, response);
//		}
//	}
//}