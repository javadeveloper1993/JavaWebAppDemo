package com.example.servlet.listner;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
@WebListener
public class ServletContextAttributeListenerDemo implements
		ServletContextAttributeListener {
	private static final Logger logger = Logger
			.getLogger(ServletContextAttributeListenerDemo.class);

	public void attributeAdded(
			ServletContextAttributeEvent servletContextAttributeEvent) {
		logger.info(">>>>>>>>>>     Servlet Context Attribute Listner Demo  : Add  >>>>>>>>>>>>>>");
		logger.info("");
		System.out.println("\tServletContext attribute added::{"
				+ servletContextAttributeEvent.getName() + ","
				+ servletContextAttributeEvent.getValue() + "}");
		logger.info("");
	}

	public void attributeRemoved(
			ServletContextAttributeEvent servletContextAttributeEvent) {
		logger.info(">>>>>>>>>>     Servlet Context Attribute Listner Demo : Remove   >>>>>>>>>>>>>>");
		logger.info("");
		logger.info("\tServletContext attribute removed::{"
				+ servletContextAttributeEvent.getName() + ","
				+ servletContextAttributeEvent.getValue() + "}");
		logger.info("");
	}

	public void attributeReplaced(
			ServletContextAttributeEvent servletContextAttributeEvent) {
		logger.info(">>>>>>>>>>     Servlet Context Attribute Listner Demo  : Replace   >>>>>>>>>>>>>>");
		logger.info("");
		logger.info("\tServletContext attribute replaced::{"
				+ servletContextAttributeEvent.getName() + ","
				+ servletContextAttributeEvent.getValue() + "}");
		logger.info("");
	}

}
