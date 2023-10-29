package pojos;

import java.sql.Date;
//pojo layer 

public class users {
	
	private int id ;
	private String first_name ;
	private String last_name;
	private String email ;
	private String password;
	private double reg_amt ;
	private Date reg_date  ;
	private String role   ;
	
	public users() {
		
	}
	
	public users(int id, String first_name, String last_name, String email, String password, double reg_amt,
			Date reg_date, String role) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.reg_amt = reg_amt;
		this.reg_date = reg_date;
		this.role = role;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
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
	public double getReg_amt() {
		return reg_amt;
	}
	public void setReg_amt(double reg_amt) {
		this.reg_amt = reg_amt;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "users [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", reg_amt=" + reg_amt + ", reg_date=" + reg_date + ", role=" + role + "]";
	}
	

}
