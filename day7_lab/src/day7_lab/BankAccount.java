package day7_lab;

public class BankAccount {
	
	private int acctNo;
	private String customerName;
	private AccountType type;
	private double balance;
	public BankAccount(int acctNo, String customerName, AccountType type, double balance) {
		super();
		this.acctNo = acctNo;
		this.customerName = customerName;
		this.type = type;
		this.balance = balance;
	}
	
	public BankAccount(int acctNo) {
		this.acctNo = acctNo;
		
	}
	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", customerName=" + customerName + ", type=" + type + ", balance="
				+ balance + "]";
	}
	public int getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public AccountType getType() {
		return type;
	}
	public void setType(AccountType type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public boolean equals(Object o) {
		System.out.println("Equals");
		if(o instanceof BankAccount)
			return ((Integer)this.acctNo).equals(((BankAccount) o).acctNo);
		return false;
	
	}
	//Hash code
			@Override
			public int hashCode() {
				System.out.println(" Hash code");
			//	return 100;
				return ((Integer)this.acctNo).hashCode();
			}
	

}
