package com.example.servlet.listner;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
@WebListener
public class ServletRequestAttributeListnerDemo implements
		ServletRequestAttributeListener {
	private static final Logger logger = Logger
			.getLogger(ServletRequestAttributeListnerDemo.class);

	public void attributeAdded(
			ServletRequestAttributeEvent servletRequestAttributeEvent) {
		logger.info(">>>>>>>>>>     Servlet Request Attribute Listner Demo  : Add  >>>>>>>>>>>>>>");
		logger.info("");
		logger.info("\tServletRequest attribute added::{"
				+ servletRequestAttributeEvent.getName() + ","
				+ servletRequestAttributeEvent.getValue() + "}");
		logger.info("");
	}

	public void attributeRemoved(
			ServletRequestAttributeEvent servletRequestAttributeEvent) {
		System.out
				.println(">>>>>>>>>>     Servlet Request Attribute Listner Demo  : Remove  >>>>>>>>>>>>>>");
		System.out.println();
		System.out.println("\tServletRequest attribute removed::{"
				+ servletRequestAttributeEvent.getName() + ","
				+ servletRequestAttributeEvent.getValue() + "}");
		System.out.println();

	}

	public void attributeReplaced(
			ServletRequestAttributeEvent servletRequestAttributeEvent) {
		logger.info(">>>>>>>>>>     Servlet Request Attribute Listner Demo : Replace   >>>>>>>>>>>>>>");
		logger.info("");
		logger.info("\tServletRequest attribute replaced::{"
				+ servletRequestAttributeEvent.getName() + ","
				+ servletRequestAttributeEvent.getValue() + "}");
		logger.info("");
	}

}
