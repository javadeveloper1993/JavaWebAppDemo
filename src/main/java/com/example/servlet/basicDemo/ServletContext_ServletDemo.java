package com.example.servlet.basicDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class ServletContext
 */
@WebServlet(urlPatterns = { "/ServletContextServletDemo" })
public class ServletContext_ServletDemo extends HttpServlet {
	private static final Logger logger = Logger
			.getLogger(ServletContext_ServletDemo.class);
	private static final long serialVersionUID = 1L;
	private ServletConfig servletConfig;

	@Override
	public void init(ServletConfig config) throws ServletException {
		servletConfig = config;
		logger.info(config.getServletName() + " : is Initilize...");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletContext servletContext = servletConfig.getServletContext();
		Enumeration<String> e = servletContext.getInitParameterNames();
		while (e.hasMoreElements()) {
			String str = "";
			str = e.nextElement();
			out.print("<br>Name: <b>" + str + "</b>");
			out.print(" => value: <b>" + servletContext.getInitParameter(str)
					+ "</b>");
		}
		logger.info("ContextPath :: " + servletContext.getContextPath());
		logger.info("ServerInfo :: " + servletContext.getServerInfo());
		logger.info("ServletContextName :: "
				+ servletContext.getServletContextName());
		out.close();
	}
}
