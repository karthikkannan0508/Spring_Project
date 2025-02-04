package com.Agriculture.Agro.dto;

public class Customer {
	private int cid;
	private String firstName;
	private String lastName;
	private long cPhone;
	
	//Getters and Setters
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getcPhone() {
		return cPhone;
	}
	public void setcPhone(long cPhone) {
		this.cPhone = cPhone;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", firstName=" + firstName + ", lastName=" + lastName + ", cPhone=" + cPhone
				+ "]";
	}
	
	

}
