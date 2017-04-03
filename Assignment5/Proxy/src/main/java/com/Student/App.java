package com.Student;

/**
 * Created by Kishan on 2017-04-03.
 */
public class App {
    public static void main (String[] args)
    {
        Student student;



        Student absentStudent = new Undergrad("James");
        student = new ProxyStudent(absentStudent);
        student.signAttendance();


    }
    }

