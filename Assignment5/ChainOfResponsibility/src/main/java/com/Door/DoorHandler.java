package com.Door;

/**
 * Created by Kishan on 2017-04-02.
 */
public abstract class DoorHandler {
    DoorHandler successor;

    public void setSuccessor(DoorHandler successor)
    {
        this.successor = successor;
    }

    public abstract String handleRequest(String request);
}
