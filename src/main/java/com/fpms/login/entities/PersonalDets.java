package com.fpms.login.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class PersonalDets {
    @Id
    private String emailId;
    private String name,designation,address,bloodGrp,gender;
    Date dob;

    public PersonalDets(){
        super();
    }

    public PersonalDets(String emailId, String name, String designation, String address, String bloodGrp, String gender, Date dob) {
        this.emailId = emailId;
        this.name = name;
        this.designation = designation;
        this.address = address;
        this.bloodGrp = bloodGrp;
        this.gender = gender;
        this.dob = dob;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBloodGrp() {
        return bloodGrp;
    }

    public void setBloodGrp(String bloodGrp) {
        this.bloodGrp = bloodGrp;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "PersonalDets{" +
                "emailId='" + emailId + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", address='" + address + '\'' +
                ", bloodGrp='" + bloodGrp + '\'' +
                ", gender='" + gender + '\'' +
                ", dob=" + dob +
                '}';
    }
}
