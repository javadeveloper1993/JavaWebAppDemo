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

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
// @WebFilter(urlPatterns="/*")
public class LogFilter implements Filter {
	private static final Logger logger = Logger.getLogger(LogFilter.class);
	FilterConfig filterConfig;

	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
		logger.info(getClass() + " is Initiliaze...!!!");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		String ipAddress = request.getRemoteAddr();
		logger.info("IP " + ipAddress + ", Time "
				+ new Date().toString());

		// Pass request back down the filter chain
		chain.doFilter(request, response);

		logger.info("Initilize Parameter Name : "
				+ filterConfig.getInitParameter("test-param"));

		logger.info(filterConfig.getFilterName()
				+ " : Executed Sucessfully...!!!");

		// PrintWriter out = response.getWriter();
		// out.print("<br/>this site is underconstruction..");
		// out.close();
		// out.close();
	}

	public void destroy() {
		logger.info(getClass() + " is Destroyed...!!!");
	}

}
