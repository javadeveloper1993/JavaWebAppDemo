package com.example.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * @author Maulik
 *
 */
public class SimpleLog4JDemo {
	private static Logger logger = Logger.getLogger(SimpleLog4JDemo.class);

	public static void main(String[] args) {
//		Layout layout = new SimpleLayout();
//		Appender appender;
//		// appender = new ConsoleAppender(layout);
//		try {
//			appender = new FileAppender(layout, "Logger.txt", true);
//			logger.addAppender(appender);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		BasicConfigurator.configure();
		logger.info("Logger Info Execute Sucessfully...!!!");
		logger.debug("Logger Debug Execute Sucessfully...!!!");
		logger.fatal("Logger Fatal Execute Sucessfully...!!!");
		logger.error("Logger Error Execute Sucessfully...!!!");
	}
}
