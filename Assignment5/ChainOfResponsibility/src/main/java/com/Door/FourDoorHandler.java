package com.Door;

import com.Door.DoorHandler;

/**
 * Created by Kishan on 2017-04-02.
 */
public class FourDoorHandler extends DoorHandler {
    @Override
    public String handleRequest(String request) {
        if(request.equalsIgnoreCase("Four"))
        {
            return "Four door";
        }
        else
        {
            return successor.handleRequest(request);
        }
    }
}
