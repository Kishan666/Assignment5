package com.Student;

/**
 * Created by Kishan on 2017-04-02.
 */
public class  Undergrad extends Student {

    public Undergrad(String name) {
        super(name);
    }

    public void signAttendance() {
        System.out.println(super.getName() + " has signed the attendance");
    }
}
