package utils;

import java.util.ArrayList;
import java.util.List;
import static utils.CustomerValidationRules.*;

import com.iacsd.Customer;

public class CustomerUtils {
	
	public static List<Customer> populatecustomer(){
		try
		{
			ArrayList<Customer> custlist=new ArrayList<>();
			custlist.add(validate("mark", "roger", "zdysz@gmail.com", "abc@123", 5000, "2000-01-01", "diamond","2023-06-01", custlist));
			custlist.add(validate("robin", "roger", "zgyfz@gmail.com", "abc@123", 2000, "2000-01-01", "Gold","2023-02-01", custlist));
			custlist.add(validate("monica", "roger", "zygdsz@gmail.com", "abc@123", 5000, "2000-01-01", "Diamond","2023-05-01", custlist));
			custlist.add(validate("chandler", "bing", "zdsyz@gmail.com", "abc@123", 1000, "2000-01-01", "Silver","2023-05-01", custlist));
			custlist.add(validate("mark", "roger", "zycz@gmail.com", "abc@123", 2000, "2000-01-01", "Gold","2023-06-01", custlist));
			custlist.add(validate("rachel", "roger", "zyscz@gmail.com", "abc@123", 2000, "2000-01-01", "Gold","2023-03-01", custlist));
			custlist.add(validate("ross", "roger", "zyszz@gmail.com", "abc@123", 1000, "2000-01-01", "silver","2023-02-01", custlist));
			custlist.add(validate("kevin", "roger", "zyzsz@gmail.com", "abc@123", 2000, "2000-01-01", "Gold","2023-02-01", custlist));
			custlist.add(validate("cristano", "roger", "zdydfz@gmail.com", "abc@123", 2000, "2000-01-01", "Gold","2023-01-01", custlist));
			custlist.add(validate("mark", "roger", "zydez@gmail.com", "abc@123", 1000, "2000-01-01", "silver","2023-01-01" ,custlist));
			custlist.add(validate("mark", "roger", "zysdz@gmail.com", "abc@123", 2000, "2000-01-01", "Gold","2023-01-01", custlist));
			return custlist;
			
			
			
			
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		
		
		
		
		
		
		
		
		return null;
		
		
		
		
		
		
		
		
	}

}
