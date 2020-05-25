package Log4JDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;

public class Log4J {
	
	private static Logger logger = LogManager.getLogger(Log4J.class);

	public static void main(String[] args) 
	{
		System.out.println("\n hello world...!  \n");
		
		logger.info("this is an information message");
		logger.error("this is an error message");
		logger.warn("this is warning message");
		logger.fatal("this is fatal message");
		
		System.out.println("this is completed");

	}

}
