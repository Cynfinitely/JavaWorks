package com.cyn.object;

public class Adress {
	private String line1;
	private String city;
	private String zip;

	public Adress(String line1, String city, String zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Adress [line1=" + line1 + ", city=" + city + ", zip=" + zip + "]";
	}

}
