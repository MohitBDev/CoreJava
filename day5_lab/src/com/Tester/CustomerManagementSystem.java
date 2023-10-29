package com.Tester;

import java.time.LocalDate;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import static utils.CustomerUtils.*;
import java.util.List;
import java.util.Scanner;
import static utils.CustomerValidationRules.*;

import com.iacsd.Customer;

import custom_exceptions.CustomerHandlingException;

public class CustomerManagementSystem {

	public static void main(String[] args) throws CustomerHandlingException {
		List<Customer> clist = populatecustomer();

		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"1. Sign up  2. Sign in 3. Change password 4. Un subscribe customer 5. Display all customers 6.natural Sort 7.custom sort");
				System.out.println("Enter option :");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter firstName,lastName,email,password,basicAmount,Dob,Plan,SubcriptionDate");
					clist.add(validate(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),
							sc.next(),sc.next(), clist));
					System.out.println("Succesfully registered ");

					break;
				case 2:
					System.out.println("Enter email id And  password");
					Customer cus = new Customer(sc.next());
					String pass = sc.next();
					int index = clist.indexOf(cus);
					if (index == -1)
						throw new CustomerHandlingException("Sign Up");
					if (clist.get(index).getPassword().equals(pass))
						System.out.println("Succesfully Loged in");
					else
						// System.out.println("Wrong pass");
						throw new CustomerHandlingException("Wrong Passs");
					break;

//					for (Customer c : clist)
//						if (clist.equals(cus) && c.getPassword() == pass)
//							System.out.println("Loged in ");
//					throw new CustomerHandlingException("Sign Up");

				case 3:
					System.out.println("Enter email id And  password");
					Customer cus1 = new Customer(sc.next());
					pass = sc.next();
					index = clist.indexOf(cus1);
					if (index == -1)
						throw new CustomerHandlingException("Sign Up");
					if (clist.get(index).getPassword().equals(pass))
						System.out.println("Succesfully Loged in");
					else
						// System.out.println("Wrong pass");
						throw new CustomerHandlingException("Wrong Passs");
					System.out.println("Enter new password");
					clist.get(index).setPassword(sc.next());
					System.out.println("password changed");

					break;

				case 4:
					System.out.println("Enter email id :");
					Customer cus2 = new Customer(sc.next());

					index = clist.indexOf(cus2);
					if (index > 0) {
						System.out.println("Enter Password");
						pass = sc.next();

						if (clist.get(index).getPassword() == pass) {
							System.out.println(clist.remove(cus2));
							System.out.println(" Un subscribed");
						} else
							throw new CustomerHandlingException("Password incorrect");
					} else
						throw new CustomerHandlingException("Account not present");

					break;
				case 5:
					Iterator<Customer> itr = clist.iterator();
					while (itr.hasNext())
						System.out.println(itr.next());
					break;
				case 6:
					System.out.println("Natural Ordering :comparable");
					Collections.sort(clist);

					Iterator<Customer> it = clist.iterator();
					while (it.hasNext())
						System.out.println(it.next());

					break;
				case 7:
					System.out.println("Custom  Ordering :comparator");

					Collections.sort(clist, new Comparator<Customer>() {
						@Override
						public int compare(Customer a, Customer b) {

							int ret = a.getDob().compareTo(b.getDob());
							if (ret == 0) {
								return ((Double) a.getRegAmount()).compareTo(b.getRegAmount());
							}
							return ret;
//				       if(ret==0) {
//				    	    if (a.getRegAmount()>b.getRegAmount())
//				    	    	return 1;
//				       if(a.getRegAmount()==b.getRegAmount())
//				    	   return 0;
//				       return -1;

//				       }

						}
					});

					Iterator<Customer> itrr = clist.iterator();
					while (itrr.hasNext())
						System.out.println(itrr.next());

					break;

				case 8:
					System.out.println("Enter  Email  :");
					Customer c1 = new Customer(sc.next());
					 index = clist.indexOf(c1);
					 if(index>=0) {
					 if(clist.get(index).getLastSubscriptionPaidDate().isBefore(LocalDate.now()))
					 System.out.println("Subcription Cancelled");
					 else if(clist.get(index).getLastSubscriptionPaidDate().isAfter(LocalDate.now()))
						 System.out.println("Expiry Date :"+clist.get(index).getLastSubscriptionPaidDate());
					
					 }
					 

					break;

				case 0:
					exit = true;
					break;

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
