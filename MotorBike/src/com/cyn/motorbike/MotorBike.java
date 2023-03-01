package com.cyn.motorbike;

public class MotorBike {
	// state
	private int speed;

	// constructors

	MotorBike() {
	};

	// to give default value you can use this constructor
	// MotorBike(){
	// this(5) here this means the other constructor we did in line 16;
	// }
	MotorBike(int speed) {
		this.speed = speed;
	}

	void setSpeed(int speed) {
		System.out.printf("This is objects speed : %d", speed).println(); // 100
		System.out.printf("this is class speed: %d", this.speed).println(); // 0
		if (speed > 0) {
			this.speed = speed;
		}
	}

	int getSpeed() {
		return this.speed;
	}

	public void increaseSpeed(int howMuch) {
		this.speed += howMuch;
		// you can use validation of other method here
		// setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		this.speed -= howMuch;
	}

	void start() {
		System.out.println("Motor Started");
	}

}
