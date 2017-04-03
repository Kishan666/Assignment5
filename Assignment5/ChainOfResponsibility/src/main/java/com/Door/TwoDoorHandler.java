package com.Door;

import com.Door.DoorHandler;

/**
 * Created by Kishan on 2017-04-02.
 */
public class TwoDoorHandler extends DoorHandler {
    @Override
    public String handleRequest(String request) {
        if(request.equalsIgnoreCase("Two"))
        {
            return "Two door";
        }
        else
        {
            return successor.handleRequest(request);
        }
    }
}
