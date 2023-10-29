package utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.List;

import com.iacsd.Customer;
import com.iacsd.ServicePlan;

import custom_exceptions.CustomerHandlingException;

public class CustomerValidationRules {

	public static Customer validate(String firstName, String lastName, String email, String password, double baseAmount,
			String dob, String plan,String subDate, List<Customer> customerList) throws CustomerHandlingException {
		checkForDup(customerList, email);
		LocalDate d = parseAndValidateDate(dob);
		ServicePlan s = parseAndValidateServicePlan(plan, baseAmount);
		double regAmount = baseAmount + s.getPlanCost();
		LocalDate subd=LocalDate.parse(subDate);
		
		

		return new Customer(firstName, lastName, email, password, regAmount, d, s,subd);

	}

	public static ServicePlan parseAndValidateServicePlan(String plan, double baseamount)
			throws IllegalArgumentException, CustomerHandlingException {
		ServicePlan sp = ServicePlan.valueOf(plan.toUpperCase());
		if (sp.getPlanCost() != baseamount)
			throw new CustomerHandlingException("Invalid Reg Amount");
		return sp;
	}

	public static LocalDate parseAndValidateDate(String date) throws DateTimeParseException, CustomerHandlingException {

		LocalDate d = LocalDate.parse(date);
		LocalDate curnt = LocalDate.now();
//		int curnt=LocalDate.now().getYear();
//		int d2=d.now().getYear();
//		int age =d1-d2;
		Period d3 = Period.between(d, curnt);
		int age = d3.getYears();
		if (age > 21)
			return d;
		throw new CustomerHandlingException("You are under age !!!");

	}
//
//	public static void validateregAmnt(ServicePlan plan, double baseamount) throws CustomerHandlingException {
//		if (plan.getPlanCost() != baseamount)
//			throw new CustomerHandlingException("Invalid Reg Amount");
//
//	}

	public static void Chkdup(Customer c, List<Customer> customerList) throws CustomerHandlingException {

		if (customerList.contains(c))
			System.out.println("Logged in");
		throw new CustomerHandlingException("Account Not Exist sign up");

	}

	public static void checksuscription(LocalDate date) throws CustomerHandlingException {

		
		if (date.isBefore(LocalDate.now()))
			throw new CustomerHandlingException("Your Sucription is Cancelled");
		if (date.isAfter(LocalDate.now()))
			System.out.println("Expiry Date :" + date);

		

	}

//add a static method to check for dup
	public static void checkForDup(List<Customer> customerList, String newEmail) throws CustomerHandlingException {
		// 1. wrap email in customer ref.
		Customer newCustomer = new Customer(newEmail);
		if (customerList.contains(newCustomer))
			throw new CustomerHandlingException("Dup Email ID , choose new email !!!!!");
		System.out.println("no dup email found....");
	}
}
