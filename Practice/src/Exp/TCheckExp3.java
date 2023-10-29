package Exp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TCheckExp3 {

	public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in)){
		System.out.println("Enter Date dd-MM-yyyy :");
		System.out.println(prasedob(sc.next()) );
		
	}
	catch(Exception e) {
		System.out.println(e.fillInStackTrace());
	}
	finally {
		System.out.println("finally");
	}
   
	
	
	
	
	

	}
	  private static Date prasedob(String d) throws ParseException  {
		  SimpleDateFormat sdf =new SimpleDateFormat("dd-MM-yyyy");
		  
			return sdf.parse(d);
		}

}
