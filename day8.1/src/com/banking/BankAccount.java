package com.banking;

import java.time.LocalDate;
import java.time.Period;

import custom_exceptions.BankingException;

import static utils.BankValidations.validateBalance;

/*
 * BankAccount : acctNo, customer name , type , balance , creation date , 
 * last tx date , isActive
 */
public class BankAccount {
	private int acctNo;
	private String customerName;
	private AcctType type;
	private double balance;
	private LocalDate createdOn;
	private LocalDate lastUpdated;
	private boolean isActive;

	// ctor
	public BankAccount(int acctNo, String customerName, AcctType type, double balance, LocalDate createdOn) {
		super();
		this.acctNo = acctNo;
		this.customerName = customerName;
		this.type = type;
		this.balance = balance;
		this.createdOn = createdOn;
		this.lastUpdated = this.createdOn;
		this.isActive = true;
	}
	// fetch a/c summary : toString

	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", customerName=" + customerName + ", type=" + type + ", balance="
				+ balance + ", createdOn=" + createdOn + ", lastUpdated=" + lastUpdated + ", isActive=" + isActive
				+ "]";
	}

	// For correct working of hashing algo + O(1) :
	// which methods(equals , hashCode) should be overridden? NONE , since HM will
	// call these methods on Key type
	// BankAccount : Value type
	public void deposit(double amount) throws BankingException{
		if (isActive) {
			balance += amount;
			this.lastUpdated=LocalDate.now();
		}
		else
			throw new BankingException("Inactive A/C !!!!!! , Can not deposit !!!!");
	}

	public void withdraw(double amount) throws BankingException {
		if (isActive) {
			validateBalance(balance - amount);
			balance -= amount;
			this.lastUpdated=LocalDate.now();
		} else
			throw new BankingException("Inactive A/C !!!!!!");
	}

	public void transferFunds(BankAccount dest, double amount) throws BankingException {
		if(!this.isActive )
			throw new BankingException("Src Account Inactive");
		if(!dest.isActive)
			throw new BankingException("Dest Account Inactive");
		this.withdraw(amount);
		dest.deposit(amount);
	}
	public void simpleinterest(Double rate)//nonstatic using customer DETAILS BY THIS operator
	{
		LocalDate cur =LocalDate.now().plusYears(2);
	    int n=Period.between(this.createdOn, cur).getYears();
		double si=(this.balance * rate * n)/100;
		double amt =this.balance+si;
		System.out.println("Simple interest :"+si);
		System.out.println("amount After simple intrest :"+amt);
		
		
	}
	
	//getters

	public int getAcctNo() {
		return acctNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public AcctType getType() {
		return type;
	}

	public void setType(AcctType type) {
		this.type = type;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDate getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDate lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public double getBalance() {
		return balance;
	}

	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}
	
	

}
