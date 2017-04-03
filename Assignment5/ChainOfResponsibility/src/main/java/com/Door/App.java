package com.Door;

/**
 * Created by Kishan on 2017-04-03.
 */
public class App {
    public static void main (String[] args)
    {
        DoorHandler chain = setUpChain();
        System.out.println(chain.handleRequest("Four"));
        System.out.println(chain.handleRequest("Two"));
        System.out.println(chain.handleRequest("No"));
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
