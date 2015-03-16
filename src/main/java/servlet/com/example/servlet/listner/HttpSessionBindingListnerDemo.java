package com.example.servlet.listner;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * @author Maulik
 *
 */
@WebListener
public class HttpSessionBindingListnerDemo implements
		HttpSessionBindingListener {

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("The value bound is " + event.getName());
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("The value unbound is " + event.getName());
	}

}
