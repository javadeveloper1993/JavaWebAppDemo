package com.example.servlet.listner;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * @author Maulik
 *
 */
@WebListener
public class ServletContextAttributeListenerDemo implements
		ServletContextAttributeListener {

	@Override
	public void attributeAdded(
			ServletContextAttributeEvent servletContextAttributeEvent) {
		System.out.println("\tServletContext attribute added::{"
				+ servletContextAttributeEvent.getName() + ","
				+ servletContextAttributeEvent.getValue() + "}");
	}

	@Override
	public void attributeRemoved(
			ServletContextAttributeEvent servletContextAttributeEvent) {
		System.out.println("\tServletContext attribute removed::{"
				+ servletContextAttributeEvent.getName() + ","
				+ servletContextAttributeEvent.getValue() + "}");		
	}

	@Override
	public void attributeReplaced(
			ServletContextAttributeEvent servletContextAttributeEvent) {
		System.out.println("\tServletContext attribute replaced::{"
				+ servletContextAttributeEvent.getName() + ","
				+ servletContextAttributeEvent.getValue() + "}");
	}

}
