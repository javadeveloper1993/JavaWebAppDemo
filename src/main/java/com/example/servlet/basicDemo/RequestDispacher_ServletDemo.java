package com.example.servlet.basicDemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDispacherDemo
 */
@WebServlet("/RequestDispacherServletDemo")
public class RequestDispacher_ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		String password = request.getParameter("userPass");
		if (password.equals("123")) {
			RequestDispatcher rd = request.getRequestDispatcher("RqdWelcome");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request
					.getRequestDispatcher("/page/error/ErrorPage.jsp");
			rd.include(request, response);

		}
	}
}
