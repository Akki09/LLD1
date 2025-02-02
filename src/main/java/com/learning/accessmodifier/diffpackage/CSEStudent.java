package com.learning.accessmodifier.diffpackage;

import com.learning.accessmodifier.Student;

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
