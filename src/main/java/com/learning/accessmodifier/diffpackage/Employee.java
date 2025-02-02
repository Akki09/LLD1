package com.learning.accessmodifier.diffpackage;

import com.learning.accessmodifier.Student;

public class Employee {

    String employeeType;

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public void test() {
        Student s = new Student();
        s.name = "Akshay";
        // Error: java: percentage has protected access in com.learning.accessmodifier.Student
        // As this employee class does not extend Student class so we can't access the protected
        // data members in different package
        //s.percentage = 98.0;
        System.out.println(s.name);
    }
}
