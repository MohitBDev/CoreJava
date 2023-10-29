package Exp;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TCheckExp {

	public static void main(String[] args) {

try(Scanner sc = new Scanner(System.in)){

	SimpleDateFormat sdf =new SimpleDateFormat("dd-MM-yyyy");
	System.out.println("Enter Date  dd-MM-yyyy  :");
	String d=sc.next();
	System.out.println(sdf.parse(d));
	Date db=sdf.parse(d);
	System.out.println(db);
	Date n =new Date();
	System.out.println(db.compareTo(n));
System.out.println(	n.after(db));


	
	
	
	
}
catch(Exception e)
{
	System.out.println(e.fillInStackTrace());
	System.out.println("excp Handled");
}
finally {
	System.out.println("Exit");
}








	}

}
