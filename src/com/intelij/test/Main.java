package com.intelij.test;

import com.intelij.test.model.Teacher;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(" Hai I am vinil");
        System.out.println("welcome to keywords");
        Teacher t = new Teacher(1,"vinil");
        System.out.println(t.getTeacherId() +" - "+t.getTeacherName());

        new Teacher(1,"vinil");
    }
}
