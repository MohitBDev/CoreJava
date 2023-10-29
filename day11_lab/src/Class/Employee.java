package Class;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {
	private String id,firstname , lastname ;
	private dept dpt;
	private  LocalDate  joiningdate ;
	public Employee(String id, String firstname, String lastname, dept dpt, LocalDate joiningdate) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dpt = dpt;
		this.joiningdate = joiningdate;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", dpt=" + dpt
				+ ", joiningdate=" + joiningdate + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public dept getDpt() {
		return dpt;
	}
	public void setDpt(dept dpt) {
		this.dpt = dpt;
	}
	public LocalDate getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(LocalDate joiningdate) {
		this.joiningdate = joiningdate;
	}
	
@Override
	public boolean equals(Object o) {
	if(o instanceof Employee)
		return this.id.equals(((Employee)o).getId());
	return false;
	
	
		
	
	
}
	
	
	
	
	

}
