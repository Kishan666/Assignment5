package com.BridgeTest;

import com.Bridge.*;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kishan on 2017-04-03.
 */
public class BridgeTest {
    @Before
    public void setup() {

    }

    @Test
    public void testStrategy() throws Exception {
        Vehicle vehicle = new BigBus(new SmallEngine());
        vehicle.drive();
        vehicle.setEngine(new BigEngine());
        vehicle.drive();

        vehicle = new SmallCar(new SmallEngine());
        vehicle.drive();
        vehicle.setEngine(new BigEngine());
        vehicle.drive();
        BigEngine bigEngine = new BigEngine();
        Assert.assertEquals(bigEngine.go(), 350);

    }
}