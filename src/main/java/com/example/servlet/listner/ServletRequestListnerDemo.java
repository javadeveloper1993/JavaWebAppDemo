package com.example.servlet.listner;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
@WebListener
public class ServletRequestListnerDemo implements ServletRequestListener {
	private static final Logger logger = Logger
			.getLogger(ServletRequestListnerDemo.class);

	public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
		logger.info(">>>>>>>>>>     Servlet Request Listner Demo : Destroye   >>>>>>>>>>>>>>");
		logger.info("");
		ServletRequest servletRequest = servletRequestEvent.getServletRequest();
		logger.info("ServletRequest destroyed. Remote IP="
				+ servletRequest.getRemoteAddr());
		logger.info("");
	}

	public void requestInitialized(ServletRequestEvent servletRequestEvent) {
		System.out
				.println(">>>>>>>>>>     Servlet Request Listner Demo  : Initialize  >>>>>>>>>>>>>>");
		logger.info("");
		ServletRequest servletRequest = servletRequestEvent.getServletRequest();
		logger.info("ServletRequest initialized. Remote IP="
				+ servletRequest.getRemoteAddr());
		logger.info("");
	}

}
