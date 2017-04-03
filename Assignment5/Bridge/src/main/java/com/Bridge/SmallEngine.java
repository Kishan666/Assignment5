/**
 * Created by Kishan on 2017-04-03.
 */


package com.Bridge;

public class SmallEngine implements Engine {

	int horsepower;

	public SmallEngine() {
		horsepower = 100;
	}

	@Override
	public int go() {
		System.out.println("The small engine is running");
		return horsepower;
	}

}
