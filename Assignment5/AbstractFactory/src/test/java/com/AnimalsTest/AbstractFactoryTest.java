package com.AnimalsTest;


import com.Animals.AbstractFactory;
import com.Animals.Dog;
import com.Animals.MammalFactory;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kishan on 2017-04-02.
 */
public class AbstractFactoryTest {
    @Before
    public void setup() {

    }

    @Test
    public void testAbstractFactory() throws Exception {
        AbstractFactory abstractFactory = new AbstractFactory();
        Assert.assertNotNull(abstractFactory.getSpeciesFactory("reptile"));
    }
        @Test
        public void testClassOrigin()throws Exception{

            AbstractFactory abstractFactory1 = new AbstractFactory();
            Assert.assertEquals(abstractFactory1.getSpeciesFactory("mammal").getClass(), new MammalFactory().getClass());
        }
        @Test
    public void testSound() throws Exception{
            AbstractFactory abstractFactory2 = new AbstractFactory();
            Assert.assertEquals(abstractFactory2.getSpeciesFactory("mammal").getAnimal("dog").makeSound(),"Woof");
        }
    }

