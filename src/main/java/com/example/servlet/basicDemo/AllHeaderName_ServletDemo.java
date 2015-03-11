package com.example.servlet.basicDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AllHeaderName
 */
@WebServlet("/allHeaderNameServletDemo")
public class AllHeaderName_ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("HTTP headers sent by your client:<br>");
		Enumeration<String> enumName = request.getHeaderNames();
		while (enumName.hasMoreElements()) {
			String headerName = (String) enumName.nextElement();
			String headerValue = request.getHeader(headerName);
			out.print("<b>" + headerName + "</b>: ");
			out.println(headerValue + "<br>");
		}
		out.close();
	}
}
