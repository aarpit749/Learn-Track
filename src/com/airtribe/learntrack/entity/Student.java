package com.airtribe.learntrack.entity;

public class Student extends Person {

    private int batch;
    private Boolean active;

    public Student(int id, String firstName, String lastName, String email, int batch, Boolean active) {
        super(id, firstName,lastName,email);
        this.batch = batch;
        this.active = active;
    }

    public Student(int id, String firstName, String lastName, int batch, Boolean active) {
        super(id, firstName,lastName,null);
        this.batch = batch;
        this.active = active;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getDisplayName(){
        return "Student: " + getFirstName() + " " + getLastName();
    }

}
