package com.app.tester;

import com.app.banking.BankAccount;

public class TestBank {

	public static void main(String[] args) {
		Object act1= new BankAccount(101,"Rama","Saving",12000);
		Object act2= new BankAccount(101,"Rama","Saving",12000);
		System.out.println(act1.getClass());
		Object o;
		o=101;//auto boxing //upcasting 
		System.out.println(o.getClass());
		
		System.out.println(act1==act2);//f
		System.out.println(act1.equals(o));//t
				

	}

}
