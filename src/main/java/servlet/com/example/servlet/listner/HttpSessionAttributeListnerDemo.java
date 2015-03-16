package com.example.servlet.listner;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * @author Maulik
 *
 */
@WebListener
public class HttpSessionAttributeListnerDemo implements
		HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
		System.out
				.println(">>>>>>>>>>     HttpSession Attribute Listner Demo  : Add  >>>>>>>>>>>>>>");
		System.out.println();
		System.out.println("\tHttpSession attribute added::{"
				+ httpSessionBindingEvent.getName() + ","
				+ httpSessionBindingEvent.getValue() + "}");
		System.out.println();
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
		System.out
				.println(">>>>>>>>>>     HttpSession Attribute Listner Demo  : Removed  >>>>>>>>>>>>>>");
		System.out.println();
		System.out.println("\tHttpSession attribute removed::{"
				+ httpSessionBindingEvent.getName() + ","
				+ httpSessionBindingEvent.getValue() + "}");
		System.out.println();
	}

	@Override
	public void attributeReplaced(
			HttpSessionBindingEvent httpSessionBindingEvent) {
		System.out
				.println(">>>>>>>>>>     HttpSessionAttributeListner Demo : Replace  >>>>>>>>>>>>>>");
		System.out.println();
		System.out.println("\tHttpSession attribute replaced::{"
				+ httpSessionBindingEvent.getName() + ","
				+ httpSessionBindingEvent.getValue() + "}");
		System.out.println();
	}

}
