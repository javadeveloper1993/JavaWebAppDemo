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
		System.out
				.println(">>>>>>>>>>     Servlet Context Attribute Listner Demo  : Add  >>>>>>>>>>>>>>");
		System.out.println();
		System.out.println("\tServletContext attribute added::{"
				+ servletContextAttributeEvent.getName() + ","
				+ servletContextAttributeEvent.getValue() + "}");
		System.out.println();
	}

	@Override
	public void attributeRemoved(
			ServletContextAttributeEvent servletContextAttributeEvent) {
		System.out
				.println(">>>>>>>>>>     Servlet Context Attribute Listner Demo : Remove   >>>>>>>>>>>>>>");
		System.out.println();
		System.out.println("\tServletContext attribute removed::{"
				+ servletContextAttributeEvent.getName() + ","
				+ servletContextAttributeEvent.getValue() + "}");
		System.out.println();
	}

	@Override
	public void attributeReplaced(
			ServletContextAttributeEvent servletContextAttributeEvent) {
		System.out
				.println(">>>>>>>>>>     Servlet Context Attribute Listner Demo  : Replace   >>>>>>>>>>>>>>");
		System.out.println();
		System.out.println("\tServletContext attribute replaced::{"
				+ servletContextAttributeEvent.getName() + ","
				+ servletContextAttributeEvent.getValue() + "}");
		System.out.println();
	}

}
