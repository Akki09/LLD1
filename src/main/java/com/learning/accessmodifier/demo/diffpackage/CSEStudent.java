package com.learning.accessmodifier.demo.diffpackage;

import com.learning.accessmodifier.demo.Student;

public class CSEStudent extends Student {

    public CSEStudent(){
        System.out.println("Inside Manual Default Constructor");
    }

    String branch;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
