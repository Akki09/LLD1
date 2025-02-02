package com.learning.accessmodifier.demo;

public class Student {
    public String name;
    protected double percentage;
    int rollNumber;
    private String emailId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void  setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
