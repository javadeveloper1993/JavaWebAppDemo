package com.example.servlet.basicDemo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDispacher_Welcome
 */
@WebServlet("/SendRedirectWelcomeServletDemo")
public class SendRedirect_Welcome_ServletDemo extends HttpServlet {
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
			response.sendRedirect(request.getContextPath() + "/MyFirstServletDemo");
		} else {
			response.sendRedirect(request.getContextPath()
					+ "/page/error/ErrorPage.jsp");
		}
	}

}
