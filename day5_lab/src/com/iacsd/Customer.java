package com.iacsd;

import java.time.LocalDate;

/*
 * customer id(int) ,first name, last name (string),email(string),password(string),
 * registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
 */
public class Customer implements Comparable<Customer>{
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double regAmount;
	private LocalDate dob;
	private LocalDate lastSubscriptionPaidDate;
	private ServicePlan plan;
	// static id gen
	public static int idGenerator;

	public Customer(String firstName, String lastName, String email, String password, double regAmount, LocalDate dob,
			ServicePlan plan,LocalDate lastSubscriptionPaidDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.dob = dob;
		this.plan = plan;
	this.lastSubscriptionPaidDate = lastSubscriptionPaidDate;
	    this.customerId = ++idGenerator;
	}
	// for verification (to be used along with equals) , add overloaded ctor to wrap
	// PK(UID) : email

	public Customer(String email) {
		super();
		this.email = email;
	}
	

	public LocalDate getLastSubscriptionPaidDate() {
		return lastSubscriptionPaidDate;
	}

	public void setLastSubscriptionPaidDate(LocalDate lastSubscriptionPaidDate) {
		this.lastSubscriptionPaidDate = lastSubscriptionPaidDate;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getRegAmount() {
		return regAmount;
	}

	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public ServicePlan getPlan() {
		return plan;
	}

	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", regAmount=" + regAmount + ", dob=" + dob + ", plan=" + plan +"  lastSubscriptionPaidDate :" +lastSubscriptionPaidDate+"]";
	}
	
	@Override
	public int compareTo(Customer c) {
		return this.email.compareTo(c.email);
	}

	// for PK based equality testing
	@Override
	public boolean equals(Object o) {
		System.out.println("in cust equals");
		if(o instanceof Customer)
			return this.email.equals(((Customer)o).email);
		return false;
		
	}

}
