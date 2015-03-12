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

	@Override
	public void sessionWillPassivate(HttpSessionEvent event) {
		System.out.println("session is about to be passivated");
	}

	@Override
	public void sessionDidActivate(HttpSessionEvent event) {
		System.out.println("session has just been activated");
	}

}
