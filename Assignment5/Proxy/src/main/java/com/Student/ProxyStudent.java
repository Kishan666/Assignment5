package com.Student;

/**
 * Created by Kishan on 2017-04-02.
 */
public class ProxyStudent extends Student {

    private Student student;

    public ProxyStudent (Student student) {
        super(student.getName());
        this.student = student;
    }

    public void signAttendance() {
        student.signAttendance();
    }

    public String getName() {
        return student.getName();
    }
}
