package com.example.servlet.basicDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigDemo
 */
@WebServlet(urlPatterns = { "/ServletConfigServletDemo" }, initParams = {
		@WebInitParam(name = "firstName", value = "Patel"),
		@WebInitParam(name = "lastName", value = "Maulik") }, description = "This Servlet Is For Servlet Config Example")
public class ServletConfig_ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig config;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out
				.println("Init Method Called...!!!" + config.getServletName());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Enumeration<String> e = config.getInitParameterNames();
		String str = "";
		while (e.hasMoreElements()) {
			str = e.nextElement();
			out.print("<br>Name: <b>" + str + "</b>");
			out.print(" => value: <b>" + config.getInitParameter(str) + "</b>");
		}
		out.close();
	}

}
