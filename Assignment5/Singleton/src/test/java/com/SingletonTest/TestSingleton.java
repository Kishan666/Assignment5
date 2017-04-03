package com.SingletonTest;

import com.Singleton.Domain.Rectangle;
import com.Singleton.Domain.Triangle;
import com.Singleton.SingletonShape;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kishan on 2017-04-02.
 */
public class TestSingleton {
    @Before
    public void setup() {

    }

    @Test
    public void testSingletonShape() {
        SingletonShape single = new SingletonShape();
      Triangle triangle = new Triangle();

        Assert.assertEquals(single.getShapeType("Triangle").toString(), triangle.toString());

    }
}
