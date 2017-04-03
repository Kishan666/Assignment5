/**
 * Created by Kishan on 2017-04-03.
 */


package com.Bridge;

public class BigEngine implements Engine {

	int horsepower;

	public BigEngine() {
		horsepower = 350;
	}

	@Override
	public int go() {
		System.out.println("The big engine is running");
		return horsepower;
	}

}
