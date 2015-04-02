package com.example.servlet.basicDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class MyFirstServlet
 */
@WebServlet(urlPatterns = { "/MyFirstServletDemo" })
public class MyFirstServlet_ServletDemo extends HttpServlet {
	private static final Logger logger = Logger
			.getLogger(MyFirstServlet_ServletDemo.class);
	private static final long serialVersionUID = 1L;
	private ServletConfig servletConfig;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyFirstServlet_ServletDemo() {
		super();
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		servletConfig = config;
		logger.info(getServletConfig().getServletName()
				+ " is Initiated");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		logger.info(getServletConfig().getServletName() + " is Destroy");
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		return servletConfig;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out
				.println(getServletConfig().getServletName() + " is Executed");
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.write("<html><body>");
		writer.write("<div><b>ServletName :: </b>"
				+ getServletConfig().getServletName() + "<div>");
		writer.write("<div><b>ContextPath :: </b>"
				+ getServletConfig().getServletContext().getContextPath()
				+ "</div>");
		writer.write("<div><b>ServerInfo :: </b>"
				+ getServletConfig().getServletContext().getServerInfo()
				+ "</div>");
		writer.write("</body></html>");
		writer.close();
	}
}
