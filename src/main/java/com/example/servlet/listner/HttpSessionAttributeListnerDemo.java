package com.example.servlet.listner;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
@WebListener
public class HttpSessionAttributeListnerDemo implements
		HttpSessionAttributeListener {

	private static final Logger logger = Logger
			.getLogger(HttpSessionAttributeListnerDemo.class);

	public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
		logger.info(">>>>>>>>>>     HttpSession Attribute Listner Demo  : Add  >>>>>>>>>>>>>>");
		logger.info("");
		logger.info("\tHttpSession attribute added::{"
				+ httpSessionBindingEvent.getName() + ","
				+ httpSessionBindingEvent.getValue() + "}");
		logger.info("");
	}

	public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
		logger.info(">>>>>>>>>>     HttpSession Attribute Listner Demo  : Removed  >>>>>>>>>>>>>>");
		logger.info("");
		logger.info("\tHttpSession attribute removed::{"
				+ httpSessionBindingEvent.getName() + ","
				+ httpSessionBindingEvent.getValue() + "}");
		logger.info("");
	}

	public void attributeReplaced(
			HttpSessionBindingEvent httpSessionBindingEvent) {
		logger.info(">>>>>>>>>>     HttpSessionAttributeListner Demo : Replace  >>>>>>>>>>>>>>");
		logger.info("");
		logger.info("\tHttpSession attribute replaced::{"
				+ httpSessionBindingEvent.getName() + ","
				+ httpSessionBindingEvent.getValue() + "}");
		logger.info("");
	}

}
