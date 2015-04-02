package com.example.servlet.listner;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
@WebListener
public class HttpSessionBindingListnerDemo implements
		HttpSessionBindingListener {

	private static final Logger logger = Logger
			.getLogger(HttpSessionBindingListnerDemo.class);

	public void valueBound(HttpSessionBindingEvent event) {
		logger.info("The value bound is " + event.getName());

	}

	public void valueUnbound(HttpSessionBindingEvent event) {
		logger.info("The value unbound is " + event.getName());
	}

}
