package com.example.servlet.listner;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
@WebListener
public class HttpSessionListnerDemo implements HttpSessionListener {
	private static final Logger logger = Logger
			.getLogger(HttpSessionListnerDemo.class);
	private static int totalActiveSessions;

	public static int getTotalActiveSession() {
		return totalActiveSessions;
	}

	public void sessionCreated(HttpSessionEvent se) {
		logger.info(">>>>>>>>>>     HttpSession Listner Demo : Create   >>>>>>>>>>>>>>");
		logger.info("");
		totalActiveSessions++;
		logger.info("\tSessionCreated - add one session into counter : "
				+ totalActiveSessions);
		logger.info("");
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		logger.info(">>>>>>>>>>     HttpSession Listner Demo : Destroyed  >>>>>>>>>>>>>>");
		logger.info("");
		totalActiveSessions--;
		logger.info("\tSessionDestroyed - deduct one session from counter :"
				+ totalActiveSessions);
		logger.info("");
	}

}
