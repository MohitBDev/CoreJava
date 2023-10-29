package com.app.tester;

import com.app.core.*;

public class Test1 {

	public static void main(String[] args) {
		Emp e=new SalesMgr();
		 System.out.println(e.getClass());
		//upcasting
		System.out.println(e.ComputeSalary());
		//compiler checks by type of ref and jvm by instance
		 e=new TempWorker();//object(Sales mgr) marked for Garbage Collector
		 System.out.println(e.getClass());
		  //upcasting
		System.out.println(e.ComputeSalary());
		Object ref=e;//upcasting 
		System.out.println(ref.getClass());
		System.out.println(((Emp)ref).ComputeSalary());//downcasting
		System.out.println(((TempWorker)ref).ComputeSalary());//downcasting
		if(ref instanceof PermanentWorker)
		System.out.println(((PermanentWorker)ref).ComputeSalary());//Class Cast Exceptn!
		else 
			System.out.println("Not PermanteWorker ");
		
		
		
		
		
		
		
	}

}
