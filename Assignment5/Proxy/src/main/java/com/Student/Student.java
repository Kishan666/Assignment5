package com.Student;

/**
 * Created by Kishan on 2017-04-02.
 */
public abstract class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public abstract void signAttendance();

    public String getName() {
        return name;
    }
}
