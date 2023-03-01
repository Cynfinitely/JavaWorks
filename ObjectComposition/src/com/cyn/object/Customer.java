package com.cyn.object;

public class Customer {
	// state
	private String name;
	private Adress homeAddress; // object composition
	private Adress workAddress; // object composition

	// creating
	public Customer(String name, Adress homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	// operations

	public Adress getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Adress homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Adress getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Adress workAddress) {
		this.workAddress = workAddress;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", homeAddress=" + homeAddress + ", workAddress=" + workAddress + "]";
	}

}
