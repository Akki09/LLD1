package com.learning.accessmodifier.demo;

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Akshay";
        s.percentage = 100.0;
        s.rollNumber = 9;
        // This will give error as emailId is not visible outside the class
        // We can set this field via setter method
        // Error: java: emailId has private access in com.learning.accessmodifier.Student
        //s.emailId = "Akshay@testing.com";

        System.out.println(s.name);
        System.out.println(s.percentage);
        System.out.println(s.rollNumber);
        // This will give error as emailId is private field and can't be access outside the class
        // We can access this field via getter method
        // Error: java: emailId has private access in com.learning.accessmodifier.Student
        //System.out.println(s.emailId);
    }
}
