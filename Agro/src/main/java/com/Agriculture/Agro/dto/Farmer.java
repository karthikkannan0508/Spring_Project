package com.Agriculture.Agro.DTO;

public class Farmer {
	private int fid;
	private String firstName;
	private String lastName;
	private long fPhone;
	
	//Getters and Setters
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
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
	public long getfPhone() {
		return fPhone;
	}
	public void setfPhone(long fPhone) {
		this.fPhone = fPhone;
	}
	@Override
	public String toString() {
		return "Farmer [fid=" + fid + ", firstName=" + firstName + ", lastName=" + lastName + ", fPhone=" + fPhone
				+ "]";
	}
	
	
	
}