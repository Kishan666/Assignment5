package com.AdapterTest;

import com.Adapter.TemperatureClassReporter;
import com.Adapter.TemperatureInfo;
import com.Adapter.TemperatureObjectReporter;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;



/**
 * Created by Kishan on 2017-04-03.
 */
public class TestAdapter {
    @Before
    public void setup() {

    }

    @Test
    public void testStrategy() throws Exception {

        System.out.println("class adapter test");
        TemperatureInfo tempInfo = new TemperatureClassReporter();
        testTempInfo(tempInfo);

        // object adapter
        System.out.println("\nobject adapter test");
        tempInfo = new TemperatureObjectReporter();
        testTempInfo(tempInfo);
        Assert.assertEquals(tempInfo.getTemperatureInF(), 85.0);

    }

    public static void testTempInfo(TemperatureInfo tempInfo) {
        tempInfo.setTemperatureInC(0);
        System.out.println("temp in C:" + tempInfo.getTemperatureInC());
        System.out.println("temp in F:" + tempInfo.getTemperatureInF());

        tempInfo.setTemperatureInF(85);
        System.out.println("temp in C:" + tempInfo.getTemperatureInC());
        System.out.println("temp in F:" + tempInfo.getTemperatureInF());

    }
}
