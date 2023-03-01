package com.cyn.object;

public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adress homeAdress = new Adress("line2", "helsinki", "59595");
		Customer customer = new Customer("cyn", homeAdress);
		System.out.println(customer);

		Adress workAdress = new Adress("linex", "helsinki", "59595");
		customer.setWorkAddress(workAdress);

		System.out.println(customer);

	}

}
