package com.epam.vnrvjiet.nikhitha.task_logger;
import java.util.*;
import org.apache.logging.log4j.*;
public class Interest {
	private static Logger LOGGER = LogManager.getLogger(Interest.class);
	Scanner scan = new Scanner(System.in);
	public float simpleInterest()
	{
		float principal,rateofinterest,timeperiod;
		
		LOGGER.info("Enter Principal");
		principal = scan.nextFloat();
		LOGGER.info("Enter rate of interest");
		rateofinterest = scan.nextFloat();
		LOGGER.info("Enter time period");
		timeperiod = scan.nextFloat();
	
		return (principal*timeperiod*rateofinterest/100);
		
	}
	public int compoundInterest()
	{
		 int principal,timeperiod,rateofinterest,n;
		 
		LOGGER.info("Enter Principal");
		principal = scan.nextInt();
		LOGGER.info("Enter rate of interest");
		rateofinterest = scan.nextInt();
		LOGGER.info("Enter time period");
		timeperiod = scan.nextInt();
		LOGGER.info("Enter no. of times it is compounded");
		n = scan.nextInt();
		scan.close();
		return (principal*(1+rateofinterest/n)^n*timeperiod)-principal;
		 
	}
	

}
