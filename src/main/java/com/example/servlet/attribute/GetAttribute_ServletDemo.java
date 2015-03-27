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
 * Servlet implementation class GetAttribute_ServletDemo
 */
@WebServlet(urlPatterns = { "/getAttributeServletDemo" }, description = "This Servlet Is For Get Attribute For ServletContext")
public class GetAttribute_ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletContext context = getServletContext();
		String n = (String) context.getAttribute("servletCalledFrom");
		out.println("Welcome to " + n);
		out.close();
	}

}
