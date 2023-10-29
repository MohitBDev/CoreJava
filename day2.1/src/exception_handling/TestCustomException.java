package exception_handling;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import static utils.ValidationRules.validateSpeed;
import static utils.ValidationRules.checkvalidity;;

public class TestCustomException  {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter current speed");
			validateSpeed(sc.nextInt());
			System.out.println("end of try....");
			
		} catch (Exception e) {
		//	e.printStackTrace();//nm mesg location
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println(" Enter Date yyyy-MM-dd :");
			Date dob = checkvalidity(sc.next());
			System.out.println("Expire Date "+dob);
			
			
		}
		System.out.println("main over.....");
	

	}
	
}
