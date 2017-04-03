package com.PrototypeTest;

import com.Prototye.Dog;
import com.Prototye.Person;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kishan on 2017-04-03.
 */
public class PrototypeTest {
    @Before
    public void setup() {

    }

    @Test
    public void testStrategy() throws Exception {
        Person person1 = new Person("Fred");
        System.out.println("person 1:" + person1);
        Person person2 = (Person) person1.doClone();
        System.out.println("person 2:" + person2);

        Dog dog1 = new Dog("Wooof!");
        System.out.println("dog 1:" + dog1);
        Dog dog2 = (Dog) dog1.doClone();
        System.out.println("dog 2:" + dog2);
        Assert.assertNotSame(dog1.doClone(),dog2,"Dog2 is the copy as dog 1 but they are no the same");
    }
}
