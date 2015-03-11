package com.example.servlet.session.httpsession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HttpSessionServletDemo
 */
@WebServlet("/HttpSessionServletDemo")
public class HttpSessionServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		out.print("Welcome " + firstName + " : " + lastName);
		HttpSession session = request.getSession(true);
		System.out.println("Session Id :: " + session.getId());
		System.out.println("Session Last Accessed Time :: "
				+ new Date(session.getLastAccessedTime()));
		session.setAttribute("firstName", firstName);
		session.setAttribute("lastName", lastName);
		out.print("<br><a href='HttpSessionGetServletDemo'>Get Session Data</a>");
		out.close();
	}

}
