package com.example.servlet.session.hiddenfield;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HiddenDeleteServletDemo
 */
@WebServlet("/HiddenServletDemo")
public class HiddenServletDemo extends HttpServlet {
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
		out.print("Welcome " + firstName + " " + lastName);
		out.print("<form action='HiddenWelcomeServletDemo'>");
		out.print("<input type='hidden' name='firstName' value='" + firstName+ "'>");
		out.print("<input type='hidden' name='lastName' value='" + lastName+ "'>");
		out.print("<input type='submit' value='go'>");
		out.print("</form>");
		out.close();
	}

}
