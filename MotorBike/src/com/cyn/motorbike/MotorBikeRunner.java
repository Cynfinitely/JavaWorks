package com.cyn.motorbike;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike ducatti = new MotorBike();
		MotorBike honda = new MotorBike();

		honda.setSpeed(100);
		ducatti.setSpeed(75);

		honda.increaseSpeed(36);
		ducatti.decreaseSpeed(12);
		System.out.println(honda.getSpeed());
		System.out.println(ducatti.getSpeed());

	}

}
