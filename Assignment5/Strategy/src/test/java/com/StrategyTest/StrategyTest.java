package com.StrategyTest;

import com.Strategy.Context;
import com.Strategy.HikeStrategy;
import com.Strategy.SkiStrategy;
import com.Strategy.Strategy;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kishan on 2017-04-03.
 */
public class StrategyTest {
    @Before
    public void setup() {

    }

    @Test
    public void testStrategy() throws Exception {
        int temperatureInF = 60;

        Strategy skiStrategy = new SkiStrategy();
        Context context = new Context(temperatureInF, skiStrategy);

        System.out.println("Is the temperature (" + context.getTemperatureInF() + "F) good for skiing? " + context.getResult());

        Strategy hikeStrategy = new HikeStrategy();
        context.setStrategy(hikeStrategy);

        System.out.println("Is the temperature (" + context.getTemperatureInF() + "F) good for hiking? " + context.getResult());
      Assert.assertEquals(context.getTemperatureInF(),60);
    }

}
