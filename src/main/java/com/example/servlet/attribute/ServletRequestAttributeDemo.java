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
 * Servlet implementation class ServletRequestAttributeDemo
 */
@WebServlet("/servletRequestAttributeDemo")
public class ServletRequestAttributeDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletRequestAttributeDemo() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ServletContext servletContext = request.getServletContext();
		request.setAttribute("Request Host",
				servletContext.getAttribute("host"));
		request.setAttribute("Request Port",
				servletContext.getAttribute("port"));
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.print("Servlet Request Demo Executed...!!!");
		writer.close();
		request.removeAttribute("Request Host");
		request.removeAttribute("Request Port");
	}
}
