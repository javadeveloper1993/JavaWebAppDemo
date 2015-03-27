package com.example.log4j;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 *
 */
public class Log4jDemoWithPropetiesFile {
	static Logger logger = Logger.getLogger(Log4jDemoWithPropetiesFile.class);

	public static void main(String[] args) {
		Log4jDemoWithPropetiesFile log4jDemoWithPropetiesFile = new Log4jDemoWithPropetiesFile();
		log4jDemoWithPropetiesFile.runMe("Maulik");
		try {
			log4jDemoWithPropetiesFile.divide();
		} catch (ArithmeticException ex) {
			logger.info(ex.getMessage(), ex);
		}
		
		try {
			log4jDemoWithPropetiesFile.divide();
		} catch (ArithmeticException ex) {
			logger.info(ex.getMessage(), ex);
		}

	}

	private void runMe(String parameter) {

		if (logger.isDebugEnabled()) {
			logger.debug("This is debug : " + parameter);
		}

		if (logger.isInfoEnabled()) {
			logger.info("This is info : " + parameter);
		}

		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);

	}

	private void divide() {
		int i = 10 / 0;
		logger.error(i);
	}
}
