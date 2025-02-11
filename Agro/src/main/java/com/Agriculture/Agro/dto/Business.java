package com.Agriculture.Agro.DTO;

public class Business {
	
	private int bid;
	private String firstName;
	private String lastName;
	private long bPhone;
	
	//Getters and Setters
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
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
	public long getbPhone() {
		return bPhone;
	}
	public void setbPhone(long bPhone) {
		this.bPhone = bPhone;
	}
	@Override
	public String toString() {
		return "Bussiness [bid=" + bid + ", firstName=" + firstName + ", lastName=" + lastName + ", bPhone=" + bPhone
				+ "]";
	}

	
	
}