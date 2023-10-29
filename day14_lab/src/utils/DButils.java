package utils;
import java.sql.*;

public class DButils {
	//add a static because we want one static connection
	private static Connection cn;
	// private static method to open connection
	public  static Connection openconn() throws SQLException {
		
		String url= "jdbc:mysql://localhost:3306/advjava?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true";
		//Driver Manager :it throws sql Exception 
	cn = DriverManager.getConnection( url, "root", "admin@123");
		
		return cn;
	}
	

}
