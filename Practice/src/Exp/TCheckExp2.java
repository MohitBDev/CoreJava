package Exp;
import java.lang.Exception;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TCheckExp2  {

	public static void main(String[] args) throws ParseException {
	Scanner sc=new Scanner(System.in);
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	System.out.println("Enter Date  yyyy-MM-dd:");
	String d=sc.next();
	System.out.println(sdf.parse(d));

	}

}
