package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

import custom_exceptions.CheckValidityException;
import custom_exceptions.SpeedOutOfRangeException;

public class ValidationRules {
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	public static SimpleDateFormat df;
	static {
		 df=new SimpleDateFormat("yyyy-MM-dd") ;
		MIN_SPEED=40;
		MAX_SPEED=80;
	}
//add a static method to validate speed
	public static void validateSpeed(int speed)  throws SpeedOutOfRangeException 
	{
		if(speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("You are driving too slow!!!!!!!!!!!!");
		if(speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("You are driving too fast , FATAL !!!!");
		System.out.println("speed within range....");
	}
	
	public static Date checkvalidity(String exp) throws ParseException 
	{
		Date db=df.parse(exp);
		if (df.parse(exp).before(new Date())) 
			throw new CheckValidityException("Expired");
			System.out.println("Valid");
			return db;
			
		
		
	
	
	
	
	
	
	
	}
	}



