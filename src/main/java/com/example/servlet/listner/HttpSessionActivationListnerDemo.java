package com.example.servlet.listner;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
@WebListener
public class HttpSessionActivationListnerDemo implements
		HttpSessionActivationListener {
	private static final Logger logger = Logger
			.getLogger(HttpSessionActivationListnerDemo.class);

	public void sessionWillPassivate(HttpSessionEvent se) {
		logger.info("session is about to be passivated");
	}

	public void sessionDidActivate(HttpSessionEvent se) {
		logger.info("session has just been activated");
	}
}
