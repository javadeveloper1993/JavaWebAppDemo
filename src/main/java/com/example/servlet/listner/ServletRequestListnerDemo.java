package com.example.servlet.listner;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @author Maulik
 *
 */
@WebListener
public class ServletRequestListnerDemo implements ServletRequestListener {

	public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
		System.out
				.println(">>>>>>>>>>     Servlet Request Listner Demo : Destroye   >>>>>>>>>>>>>>");
		System.out.println();
		ServletRequest servletRequest = servletRequestEvent.getServletRequest();
		System.out.println("ServletRequest destroyed. Remote IP="
				+ servletRequest.getRemoteAddr());
		System.out.println();
	}

	public void requestInitialized(ServletRequestEvent servletRequestEvent) {
		System.out
				.println(">>>>>>>>>>     Servlet Request Listner Demo  : Initialize  >>>>>>>>>>>>>>");
		System.out.println();
		ServletRequest servletRequest = servletRequestEvent.getServletRequest();
		System.out.println("ServletRequest initialized. Remote IP="
				+ servletRequest.getRemoteAddr());
		System.out.println();
	}

}
