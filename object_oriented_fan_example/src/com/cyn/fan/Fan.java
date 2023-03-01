package com.cyn.fan;

public class Fan {

	// state
	private String make;
	private double radius;
	private String color;

	private boolean isOn;
	private byte speed; // 1 to 5

	// creation

	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	// isOn
	public void switchOnFan() {
		this.isOn = true;
		setSpeed((byte) 3);
	}

	public void switchOffFan() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	// speed

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return String.format("made by- %s , radius is - %f , color - %s, isOn - %b , speed - %d", make, radius, color,
				isOn, speed);
	}

}
