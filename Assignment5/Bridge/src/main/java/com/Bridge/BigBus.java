/**
 * Created by Kishan on 2017-04-03.
 */


package com.Bridge;

public class BigBus extends Vehicle {

	public BigBus(Engine engine) {
		this.weightInKilos = 3000;
		this.engine = engine;
	}

	@Override
	public void drive() {
		System.out.println("\nThe big bus is driving");
		int horsepower = engine.go();
		reportOnSpeed(horsepower);
	}

}
