package com.epam.vnrvjiet.nikhitha.task_logger;
import org.apache.logging.log4j.*;
/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger LOGGER = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	float result1,result2;
        Interest i=new Interest();
        result1=i.simpleInterest();
        LOGGER.info(result1);
        result2=i.compoundInterest();
        LOGGER.info(result2);
    }
}
