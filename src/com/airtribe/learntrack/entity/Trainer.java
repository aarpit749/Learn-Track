package com.airtribe.learntrack.entity;

public class Trainer extends  Person{

    String skills;
    int yearsofexp;

    public Trainer(int id, String firstName, String lastName, String email, String skills, int yearsofexp) {
        super(id, firstName, lastName, email);
        this.skills = skills;
        this.yearsofexp = yearsofexp;
    }

    public String getDisplayName(){
        return "Trainer: " + getFirstName() + " " + getLastName();
    }
}
