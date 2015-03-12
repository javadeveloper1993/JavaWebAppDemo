package com.example.servlet.listner;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * @author Maulik
 *
 */
@WebListener
public class ServletRequestAttributeListnerDemo implements
		ServletRequestAttributeListener {

	@Override
	public void attributeAdded(
			ServletRequestAttributeEvent servletRequestAttributeEvent) {
		System.out
				.println(">>>>>>>>>>     Servlet Request Attribute Listner Demo  : Add  >>>>>>>>>>>>>>");
		System.out.println();
		System.out.println("\tServletRequest attribute added::{"
				+ servletRequestAttributeEvent.getName() + ","
				+ servletRequestAttributeEvent.getValue() + "}");
		System.out.println();
	}

	@Override
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

	@Override
	public void attributeReplaced(
			ServletRequestAttributeEvent servletRequestAttributeEvent) {
		System.out
				.println(">>>>>>>>>>     Servlet Request Attribute Listner Demo : Replace   >>>>>>>>>>>>>>");
		System.out.println();
		System.out.println("\tServletRequest attribute replaced::{"
				+ servletRequestAttributeEvent.getName() + ","
				+ servletRequestAttributeEvent.getValue() + "}");
		System.out.println();
	}

}
