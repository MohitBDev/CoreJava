package tester;

import static utils.DButils.openconn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class unsubscribe {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in);
				Connection cn = openconn();
				PreparedStatement pst = cn.prepareStatement("delete  from users where id=? ");

		){
			System.out.println("Enter id yo unsubscribe :");
			pst.setInt(1, sc.nextInt());

			int count= pst.executeUpdate();
			if(count>=1)
			System.out.println("user Deleted : "+count);
			else 
				System.out.println("invalid user !");
				
			
				
				
			}
			catch(Exception e) {
				e.printStackTrace();
				
			}
			
			
	}
	
	}

		
		

	
	


