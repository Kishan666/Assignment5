/**
 * Created by Kishan on 2017-04-03.
 */


package com.Bridge;

public class SmallCar extends Vehicle {

	public SmallCar(Engine engine) {
		this.weightInKilos = 600;
		this.engine = engine;
	}

	@Override
	public void drive() {
		System.out.println("\nThe small car is driving");
		int horsepower = engine.go();
		reportOnSpeed(horsepower);
	}

}