/**
 * Created by Kishan on 2017-04-03.
 */

package com.Bridge;

public class App {

	public static void main(String[] args) {

		Vehicle vehicle = new BigBus(new SmallEngine());
		vehicle.drive();
		vehicle.setEngine(new BigEngine());
		vehicle.drive();

		vehicle = new SmallCar(new SmallEngine());
		vehicle.drive();
		vehicle.setEngine(new BigEngine());
		vehicle.drive();

	}

}
