package threadLab;

import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
	
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter ranger Start  abd End ");
			int start = sc.nextInt();
			int end =sc.nextInt();
			
//		//	Oddthrd odd=new Oddthrd(start ,end );
//			Eventhrd even=new Eventhrd(start ,end );
//			AveragerThrd avg=new AveragerThrd(start ,end );
			//Imple Runnable Thread(Runnable Instance ,String Name)
			Thread t1 =new Thread(new Oddthrd(start ,end ), "odd");
			Thread t2 =new Thread(new Eventhrd(start ,end ), "Even");
			Thread t3 =new Thread(new AveragerThrd(start ,end ), "Averager");
			//start the thrds
			t1.start();
			t2.start();
			t3.start();
			System.out.println("main wating ");
			t1.join();
			t2.join();
			
			t3.join();
			
			
			
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
