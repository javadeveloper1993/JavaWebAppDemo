package com.example.servlet.session.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieDeleteServletDemo
 */
@WebServlet("/CookieDeleteServletDemo")
public class CookieDeleteServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CookieDeleteServletDemo() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Cookie firstName = new Cookie("firstName", "");
		firstName.setMaxAge(0);
		Cookie lastName = new Cookie("lastName", "");
		lastName.setMaxAge(0);
		response.addCookie(firstName);
		response.addCookie(lastName);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<b>Cookie Deleted SucessFully....!!!</b><br>");
		out.print("<form action='index.html'>");
		out.print("<input type='submit' value='Click To Add Cookie'>");
		out.print("</form>");
		out.close();
	}

}
