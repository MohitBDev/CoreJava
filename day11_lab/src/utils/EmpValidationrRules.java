package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;

import Class.Employee;
import Class.dept;
import Custom_Exception.EmpExceptn;

public class EmpValidationrRules {
	public static Employee validate(String id, String fname, String lname, String dpt, String date,
			Map<String, Employee> map) throws EmpExceptn {
		String eid = checkfordup(map, id);
		dept d = validatedept(dpt);
		LocalDate jd = validatejoindate(date);

		return new Employee(eid, fname, lname, d, jd);
	}

	public static LocalDate validatejoindate(String d) throws EmpExceptn {
		LocalDate date = LocalDate.parse(d);

		int p = Period.between(date, LocalDate.now()).getYears();
		if (p > 3)
			throw new EmpExceptn("Invalid Joining Date");

		return date;

	}

	public static dept validatedept(String dpt) {
		dept dp = dept.valueOf(dpt.toUpperCase());
		return dp;

	}

	public static String checkfordup(Map<String, Employee> emap, String id) throws EmpExceptn {
		if (emap.containsKey(id))
			throw new EmpExceptn("Check for dup !!");
		return id;

	}

}
