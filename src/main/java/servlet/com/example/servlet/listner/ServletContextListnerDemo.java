package com.example.servlet.listner;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.mongodb.MongoClient;

/**
 * @author Maulik
 *
 */
@WebListener
public class ServletContextListnerDemo implements ServletContextListener {

	private MongoClient client;

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		ServletContext servletContext = servletContextEvent.getServletContext();
		System.out.println("Servlet Context Initilize With Path :"
				+ servletContext.getContextPath());
		try {
			client = new MongoClient("localhost", 27017);
			System.out
					.println(">>>>>>>>>>>>>>>>>> MongoDb Information >>>>>>>>>>>>>>>");
			System.out.println("Host Name : " + client.getAddress().getHost());
			servletContext.setAttribute("host", client.getAddress().getHost());
			System.out.println("port : " + client.getAddress().getPort());
			servletContext.setAttribute("port", client.getAddress().getPort());
			System.out.println("DatabaseNames : " + client.getDatabaseNames());
			servletContext.setAttribute("DatabaseNames",
					client.getDatabaseNames());
			System.out.println("MongoDb Conection Created Sucessfully...!!!");
			System.out.println();
		} catch (Exception e) {
			System.out.println("In Exception Mode");
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		ServletContext servletContext = servletContextEvent.getServletContext();
		System.out.println("Servlet Context Destroyed With Path :"
				+ servletContext.getContextPath());
		client.close();
		System.out.println("MongoDb Conection Closed Sucessfully...!!!");
		servletContext.removeAttribute("host");
		servletContext.removeAttribute("port");
		servletContext.removeAttribute("DatabaseNames");
		System.out.println();
	}
}
