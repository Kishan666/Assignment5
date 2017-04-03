package com.Door;

import com.Door.DoorHandler;

/**
 * Created by Kishan on 2017-04-02.
 */

public class NoDoorHandler extends DoorHandler {
    @Override
    public String handleRequest(String request) {
        if(request.equalsIgnoreCase("No"))
        {
            return "No Door";
        }
        else
        {
            return successor.handleRequest(request);
        }
    }
}
