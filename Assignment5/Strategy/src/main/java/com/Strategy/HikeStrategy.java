/**
 * Created by Kishan on 2017-04-03.
 */

package com.Strategy;

public class HikeStrategy implements Strategy {

	@Override
	public boolean checkTemperature(int temperatureInF) {
		if ((temperatureInF >= 50) && (temperatureInF <= 90)) {
			return true;
		} else {
			return false;
		}
	}

}
