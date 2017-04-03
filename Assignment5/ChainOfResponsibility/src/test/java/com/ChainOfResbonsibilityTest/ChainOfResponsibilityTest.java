package com.ChainOfResbonsibilityTest;

import com.Door.DoorHandler;
import com.Door.FourDoorHandler;
import com.Door.NoDoorHandler;
import com.Door.TwoDoorHandler;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;



/**
 * Created by Kishan on 2017-04-03.
 */
public class ChainOfResponsibilityTest {


    @Before
    public void setup() {




    }


       @Test
       public void testChain() throws Exception
       {
           System.out.println(setUpChain().handleRequest("No"));
       Assert.assertEquals(setUpChain().handleRequest("No"),"No Door");
   }
    public static DoorHandler setUpChain()
    {
        DoorHandler noDoorHandler = new NoDoorHandler();
        DoorHandler fourDoorHandler = new FourDoorHandler();
        DoorHandler twoDoorHandler = new TwoDoorHandler();
        noDoorHandler.setSuccessor(fourDoorHandler);
        fourDoorHandler.setSuccessor(twoDoorHandler);
        return noDoorHandler;
    }

}

