package com.example.servlet.listner;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * @author Maulik
 *
 */
@WebListener
public class HttpSessionActivationListnerDemo implements
		HttpSessionActivationListener {

	public void sessionWillPassivate(HttpSessionEvent se) {
		System.out.println("session is about to be passivated");
	}

	public void sessionDidActivate(HttpSessionEvent se) {
		System.out.println("session has just been activated");
	}
}
