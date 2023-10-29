package Tester;

import java.util.HashSet;
import java.util.Iterator;

import day7_lab.AccountType;
import day7_lab.BankAccount;

public class TestAccountSet {

	public static void main(String[] args) {
		HashSet<BankAccount> hs=new HashSet<>();//Size=0,Capacity=16,LoadFactor=0.75;
		BankAccount a1 =new BankAccount( 1, "mark" , AccountType.SAVING, 2000);
		BankAccount a2 =new BankAccount( 2, "mark" , AccountType.SAVING, 2000);
		BankAccount a3 =new BankAccount( 4, "mark" , AccountType.SAVING, 2000);
		BankAccount a4=new BankAccount( 2 , "mark" , AccountType.CURRENT, 2000);
		BankAccount a5 =new BankAccount( 5, "mark" , AccountType.SAVING, 2000);
		BankAccount a6 =new BankAccount( 5, "mark" , AccountType.LOAN, 2000);
		System.out.println("Added :" +hs.add(a1));
		System.out.println("Added :" +hs.add(a2));
		System.out.println("Added :" +hs.add(a3));
		System.out.println("Added :" +hs.add(a4));
		System.out.println("Added :" +hs.add(a5));
		System.out.println("Added :" +hs.add(a6));

//		Iterator<BankAccount> it = hs.iterator();
//		while(it.hasNext())
//			System.out.println(it.next());
		for (BankAccount b: hs)
			System.out.println(b);
		

	}

}
