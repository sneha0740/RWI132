package com.railworld;

public class EmployeeBean {
	private int Eid;
	private String name;
	private String  email ;
	private  String designation;
	public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeBean(int eid, String name, String email, String designation) {
		super();
		Eid = eid;
		this.name = name;
		this.email = email;
		this.designation = designation;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "EmployeeBean [Eid=" + Eid + ", name=" + name + ", email=" + email + ", designation=" + designation
				+ "]";
	}
	
	

}
