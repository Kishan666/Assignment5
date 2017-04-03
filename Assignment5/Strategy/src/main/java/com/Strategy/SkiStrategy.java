/**
 * Created by Kishan on 2017-04-03.
 */

package com.Strategy;

public class SkiStrategy implements Strategy {

	@Override
	public boolean checkTemperature(int temperatureInF) {
		if (temperatureInF <= 32) {
			return true;
		} else {
			return false;
		}
	}

}
