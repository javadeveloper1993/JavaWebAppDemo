package com.example.servlet.listner;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author Maulik
 *
 */
@WebListener
public class HttpSessionListnerDemo implements HttpSessionListener {
	private static int totalActiveSessions;

	public static int getTotalActiveSession() {
		return totalActiveSessions;
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println(">>>>>>>>>>     HttpSession Listner Demo : Create   >>>>>>>>>>>>>>");
		System.out.println();
		totalActiveSessions++;
		System.out.println("\tSessionCreated - add one session into counter : "
				+ totalActiveSessions);
		System.out.println();
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println(">>>>>>>>>>     HttpSession Listner Demo : Destroyed  >>>>>>>>>>>>>>");
		System.out.println();
		totalActiveSessions--;
		System.out
				.println("\tSessionDestroyed - deduct one session from counter :"
						+ totalActiveSessions);
		System.out.println();
	}

}
