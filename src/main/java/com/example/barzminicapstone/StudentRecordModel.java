package com.example.barzminicapstone;

import java.util.List;

public class StudentRecordModel {
    private String major;
    private String fullName;
    private String address;
    private String province;
    private String city;
    private String postal;
    private String phone;
    private String email;
    private List<String> subjects;
    private boolean isVolunteer;
    private boolean isCouncil;

    public StudentRecordModel() {}

    public void setMajor(String input)
    {
        this.major = input;
    }
    public void setFullName(String input) {
        this.fullName = input;
    }
    public void setAddress(String input) {
        this.address = input;
    }
    public void setProvince(String input) {
        this.province = input;
    }
    public void setCity(String input) {
        this.city = input;
    }
    public void setPostal(String input) {
        this.postal = input;
    }
    public void setPhone(String input) {
        this.phone = input;
    }
    public void setEmail(String input) {
        this.email = input;
    }
    public void setSubjects(List<String> input) {
        this.subjects = input;
    }
    public void setCouncil(boolean bool)
    {
        this.isCouncil = bool;
    }
    public void setVolunteer(boolean bool)
    {
        this.isVolunteer = bool;
    }
    public String getExtracurricular() {
        if (isVolunteer && isCouncil) {
            return "Student Council, Volunteer Work";
        }
        else if (isVolunteer) {
            return "Volunteer Work";
        }
        else if (isCouncil) {
            return "Student Council";
        }
        else {
            return "None";
        }
    }

    protected String displayRecord() {
        return    "Name    : " + fullName +
                "\nAddress : " + address +
                "\nCity    : " + city + ", " + province + ", " + postal +
                "\nPhone   : " + phone +
                "\nEmail   : " + email +
                "\nMajor   : " + major +
                "\nSubjects: " + subjects.toString() +
                "\nActivity: " + getExtracurricular();
    }
}
