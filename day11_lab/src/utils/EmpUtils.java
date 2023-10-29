package utils;
import static Class.dept.FINANCE;
import static Class.dept.HR;
import static Class.dept.PRODUCTION;
import static Class.dept.RND;
import static Class.dept.SALES;
import static java.time.LocalDate.parse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import Class.Employee;

public class EmpUtils {
	public static List<Employee> PopulateEmplist(){
		List<Employee> elist=new ArrayList();
		elist.add(new Employee("abc12", "virat", "kholi", PRODUCTION, parse("2022-05-09")));
		elist.add(new Employee("abc13", "MS", "Dhoni", RND, parse("2022-05-03")));
		elist.add(new Employee("abc14", "Rohit", "Sharma", SALES, parse("2021-02-06")));
		elist.add(new Employee("abc15", "Hardik", "Pandya", HR, parse("2022-08-09")));
		elist.add(new Employee("abc16", "Ishan", "kisan", FINANCE, parse("2020-03-01")));
		
		
		
		return elist;
	}
	
	
	public static Map<String,Employee> PopulateEmpmap(List<Employee> li){
		Map<String,Employee> emap=new HashMap<>();
		for (Employee e : li)
			System.out.println("Put rets " + emap.put(e.getId(), e));
		System.out.println("Size"+emap.size());
		
		
		
		return emap;
		
		
	
		
	}
	
}

