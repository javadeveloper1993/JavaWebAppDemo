package com.example.servlet.attribute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetAttribute_ServletDemo
 */
@WebServlet(urlPatterns = { "/SetAttributeServletDemo" }, description = "This Servlet Is For Set Attribute For ServletContext")
public class SetAttribute_ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletContext servletContext = request.getServletContext();
		servletContext.setAttribute("servletCalledFrom",
				getServletName());
		out.println("Welcome to set Attribure servlet");
		out.println("<a href='getAttributeServletDemo'>Click For Get Servlet Page</a>");
		out.close();
	}

}
