package com.personal.dlcalculator.model;

public class PersonDetails {
	private String name;
	private String address;
	private String bloodGroup;
	
	public PersonDetails() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	@Override
	public String toString() {
		return "Name : " + name + "\nAddress : " + address + "\nBlood Group : " + bloodGroup;
	}

}
