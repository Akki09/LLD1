package com.learning.accessmodifier.demo.diffpackage;

public class DifferentMain {

    public static void main(String[] args) {
        CSEStudent cseStudent = new CSEStudent();
        cseStudent.branch = "Computer Science & Engineering";
        cseStudent.name = "Akshay";

        // Even percentage is protected and CSEStudent can access still we will get error.
        // Reason We can access percentage inside the CSEStudent but not outside any class which
        // does not extend Student (not even main) Although we can access via setPercentage as those are public
        // Error: java: percentage has protected access in com.learning.accessmodifier.Student
        //cseStudent.percentage = 99.0;

        // As rollNumber has default access so we can't use outside the package
        // Error: java: rollNumber is not public in com.learning.accessmodifier.Student; cannot be accessed from outside package
        //cseStudent.rollNumber = 9;

        // This will give error as emailId is not visible outside the class
        // We can set this field via setter method
        // Error: java: emailId has private access in com.learning.accessmodifier.Student
        //s.emailId = "Akshay@testing.com";

        System.out.println(cseStudent.name);
        System.out.println(cseStudent.branch);
        //System.out.println(cseStudent.percentage);
        //System.out.println(cseStudent.rollNumber);
        //System.out.println(cseStudent.emialId);

        // Even emailId is having private access modifier but this keyword has it's data member
        // it will get value via parent class method which is accessing private data members
        // like getEmailId()
        cseStudent.setEmailId("Akshay@testing.com");
        System.out.println(cseStudent.getEmailId());

        Employee e = new Employee();
        // Check this method
        e.test();

    }
}
