package com.app.banking;


public class BankAccount {
	private int acctNo;
	private String name,type;
	private double balance;
	
	
	
	
	
	
	
	public BankAccount(int acctNo, String name, String type, double balance) {
		super();
		this.acctNo = acctNo;
		this.name = name;
		this.type = type;
		this.balance = balance;
	}
	public BankAccount(int acctNo) {
		this.acctNo=acctNo;
	}
	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", name=" + name + ", type=" + type + ", balance=" + balance + "]";
	}
	
	
	
	public boolean equals(Object a) {
		System.out.println("equals");
		
		//BankAccount b=new BankAccount(id);
		
		if(a instanceof BankAccount)
		return  this.acctNo==((BankAccount)a).acctNo;
		return false;
	//	return this.acctNo.equals((BankAccount)a.acctNo);
		
		
	}

}
