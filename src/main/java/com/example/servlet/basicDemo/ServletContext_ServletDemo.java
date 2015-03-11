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

/**
 * Servlet implementation class ServletContext
 */
@WebServlet(urlPatterns = { "/ServletContextServletDemo" })
public class ServletContext_ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println(config.getServletName() + " : is Initilize...");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletContext servletContext = getServletContext();
		Enumeration<String> e = servletContext.getInitParameterNames();
		while (e.hasMoreElements()) {
			String str = "";
			str = e.nextElement();
			out.print("<br>Name: <b>" + str + "</b>");
			out.print(" => value: <b>" + servletContext.getInitParameter(str)
					+ "</b>");
		}
		System.out.println("ContextPath :: " + servletContext.getContextPath());
		System.out.println("ServerInfo :: " + servletContext.getServerInfo());
		System.out.println("ServletContextName :: "
				+ servletContext.getServletContextName());
		out.close();
	}
}
