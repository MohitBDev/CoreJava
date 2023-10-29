package Tester;
import static utils.EmpValidationrRules.validate;
import static utils.IOUtils.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Class.Employee;
import Class.dept;

public class test1 {

	

	public static void main(String[] args) {
	//	List<Employee> emplist=PopulateEmplist();
	//Map<String,Employee> hs= PopulateEmpmap(emplist);
		boolean exit=false;
		try(Scanner sc =new Scanner(System.in))
		{
			List<Employee> elist= new ArrayList<>();
			Map<String,Employee> emap=new HashMap<>();
			
			System.out.println("1. Hire new emp\n" + 
					"2. List all emp details\n" + 
					"3. Promote an emp\n" + 
					"4. Delete emp details\n" + 
					"5. Sort emps as per join date n display the same.\n" + 
					"0. Exit");
			while(!exit) {
				
				System.out.println("Enter Option :");
				switch(sc.nextInt()) {
				case 1:
					System.out.println(" Enter id, firstname, lastname, dept, joiningdate");
					elist.add(validate(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), emap));
				      for(Employee e:elist)
				    	  emap.put(e.getId(), e);
					
					break;
				case 2:
					for(Employee e:emap.values())
						System.out.println(e);
					break;
				case 3:
					System.out.println("Enter Id to Promote");
					String ky=sc.next();
					Employee e4 =emap.get(sc.next());
					System.out.println("Enter Dept to Promote");
					dept d= dept.valueOf(sc.next().toUpperCase());
					e4.setDpt(d);
					break;
				case 4:
					System.out.println("Enter Id to Delete");
					String key=sc.next();
					Employee e=emap.get(key);
					emap.remove(key, e);
					elist.remove(e);
					break;
				case 5:
					System.out.println("Sorted map Joining Date ");
					emap.values().stream().sorted((e1,e2)->e1.getJoiningdate().compareTo(e2.getJoiningdate())).forEach(s->System.out.println(s));
					break;
				case 6:
					System.out.println(" Enter filename to Store :");
					
					store(sc.next(), emap);
					
					break;
				case 7:
					System.out.println(" Enter filename to Restore :");
				
					 Map<String, Employee> restore = restore(sc.next());
					 restore.values().forEach(System.out::println);
					break;
				
				case 0:
					exit=true;
					break;
				
				
				}
				
				
				
				
			}
			
			
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	
	
	

	}

}
