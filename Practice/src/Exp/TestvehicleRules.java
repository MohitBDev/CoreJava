package Exp;


import java.text.ParseException;
import java.util.Scanner;

import CusExp.LicRules;
import static utils.ValRules.*;

public class TestvehicleRules  {
	public static void main(String[] args) throws ParseException, LicRules {
		
		try(Scanner sc = new Scanner(System.in))
		{

			System.out.println("Enter Speed :");
			valspeed(sc.nextInt());
			System.out.println("Enter Lic Date dd-MM-yyy:");
			valLic(sc.next());

		} 
		catch (Exception e) {
			System.out.println("catch");
			e.printStackTrace();
			System.out.println(e.getMessage());

		} finally {
			
			System.out.println("Finnaly");
			
		}
	}

}
