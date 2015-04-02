package com.example.servlet.listner;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.log4j.Logger;

import com.mongodb.MongoClient;

/**
 * @author Maulik
 * 
 */
@WebListener
public class ServletContextListnerDemo implements ServletContextListener {
	private static final Logger logger = Logger
			.getLogger(ServletContextListnerDemo.class);
	private MongoClient client;

	public void contextInitialized(ServletContextEvent servletContextEvent) {
		ServletContext servletContext = servletContextEvent.getServletContext();
		logger.info("Servlet Context Initilize With Path :"
				+ servletContext.getContextPath());
		try {
			client = new MongoClient("localhost", 27017);
			System.out
					.println(">>>>>>>>>>>>>>>>>> MongoDb Information >>>>>>>>>>>>>>>");
			logger.info("Host Name : " + client.getAddress().getHost());
			servletContext.setAttribute("host", client.getAddress().getHost());
			logger.info("port : " + client.getAddress().getPort());
			servletContext.setAttribute("port", client.getAddress().getPort());
			logger.info("DatabaseNames : " + client.getDatabaseNames());
			servletContext.setAttribute("DatabaseNames",
					client.getDatabaseNames());
			logger.info("MongoDb Conection Created Sucessfully...!!!");
			logger.info("");
		} catch (Exception e) {
			logger.info("In Exception Mode");
			logger.info(e.getMessage());
		}

	}

	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		ServletContext servletContext = servletContextEvent.getServletContext();
		logger.info("Servlet Context Destroyed With Path :"
				+ servletContext.getContextPath());
		client.close();
		logger.info("MongoDb Conection Closed Sucessfully...!!!");
		servletContext.removeAttribute("host");
		servletContext.removeAttribute("port");
		servletContext.removeAttribute("DatabaseNames");
		logger.info("");
	}

}
