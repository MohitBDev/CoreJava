package tester;

import static utils.DButils.openconn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Testdbconn {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in);
				Connection cn = openconn();
				PreparedStatement pst = cn.prepareStatement("Select *from users where role = ? and  reg_amt > ?");

		) {
			System.out.println("Enter  Role and Registration Amount :");
			pst.setString(1, sc.next().toUpperCase());
			pst.setDouble(2, sc.nextDouble());
			try(ResultSet rs= pst.executeQuery()){
				
				//result cursor is before  1st row 
			//	rs.next() throws Sql Exception
				while (rs.next()) {
					//get Type (int column position or name )
					System.out.println("User  ID "+rs.getInt(1)
					+"  Name "+rs.getString(2)+" "
							+rs.getString(3)+" Email "+rs.getString("email")
					+" Reg amount" +rs.getDouble(6)+" Reg Date "+rs.getDate(7)
					+ "Role"+rs.getString(8));
				}
				
			}
			catch(Exception e)
			
			{
				e.printStackTrace();
				
			}
			
			
			

			System.out.println("conn open" + cn);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
