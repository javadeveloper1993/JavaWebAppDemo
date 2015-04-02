package com.example.servlet.session.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class HttpSessionDeleteServletDemo
 */
@WebServlet("/HttpSessionDeleteServletDemo")
public class HttpSessionDeleteServletDemo extends HttpServlet {
	private static final Logger logger = Logger
			.getLogger(HttpSessionDeleteServletDemo.class);
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HttpSessionDeleteServletDemo() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		session.invalidate();
		out.print("Session Deleted Sucessfully...!!!");
		logger.info("Session Id :: " + session.getId());
		out.print("<br><a href='HttpSessionServletDemo.html'>Create Session</a>");
		out.close();
	}

}
