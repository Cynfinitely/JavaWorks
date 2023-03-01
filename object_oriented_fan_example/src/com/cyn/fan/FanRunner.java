package com.cyn.fan;

public class FanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan = new Fan("Manufacturer 1", 0.2342, "GREEN");

		System.out.println(fan);
		fan.switchOnFan();
		fan.switchOffFan();
		fan.setSpeed((byte) 2);
	}

}
