/**
 * 
 */
package com.example.servlet.filter;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author Maulik
 *
 */
//@WebFilter(urlPatterns="/*")
public class LogFilter implements Filter {
	FilterConfig filterConfig;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
		System.out.println(getClass() + " is Initiliaze...!!!");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		String ipAddress = request.getRemoteAddr();
		System.out.println("IP " + ipAddress + ", Time "
				+ new Date().toString());

		// Pass request back down the filter chain

		chain.doFilter(request, response);

		System.out.println("Initilize Parameter Name : "
				+ filterConfig.getInitParameter("test-param"));

		System.out.println(filterConfig.getFilterName()
				+ " : Executed Sucessfully...!!!");

		// PrintWriter out = response.getWriter();
		// out.print("<br/>this site is underconstruction..");
		// out.close();
		// out.close();
	}

	@Override
	public void destroy() {
		System.out.println(getClass() + " is Destroyed...!!!");
	}

}
