package tester;
import static utils.DButils.*;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class subcribe {

	public static void main(String[] args) {
	
		try(Scanner sc =new Scanner(System.in);
				Connection cn= openconn();
			PreparedStatement pst= cn.prepareStatement("insert into users values(5,'Virat','Kale','virst@gmail.com','453',1800,'2020-3-4','CUSTOMER') ");	
				
				
				){
			
			

			int count= pst.executeUpdate();
			if(count>=1)
			System.out.println("user Added : "+count);
			else 
				System.out.println("invalid user !");
			
			
			
			
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		

	}

}
