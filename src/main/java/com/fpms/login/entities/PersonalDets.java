package com.fpms.login.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class PersonalDets {
    @Id
    private String emailId;
    private String name,address,bloodGrp,gender,indusExp,teachExp;
    Date dob;
    private long contact;

    public PersonalDets(){
        super();
    }

    public PersonalDets(String emailId, String name, String address, String bloodGrp, String gender, String indusExp, String teachExp, Date dob, long contact) {
        this.emailId = emailId;
        this.name = name;
        this.address = address;
        this.bloodGrp = bloodGrp;
        this.gender = gender;
        this.indusExp = indusExp;
        this.teachExp = teachExp;
        this.dob = dob;
        this.contact = contact;
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

    public String getIndusExp() {
        return indusExp;
    }

    public void setIndusExp(String indusExp) {
        this.indusExp = indusExp;
    }

    public String getTeachExp() {
        return teachExp;
    }

    public void setTeachExp(String teachExp) {
        this.teachExp = teachExp;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "PersonalDets{" +
                "emailId='" + emailId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", bloodGrp='" + bloodGrp + '\'' +
                ", gender='" + gender + '\'' +
                ", indusExp='" + indusExp + '\'' +
                ", teachExp='" + teachExp + '\'' +
                ", dob=" + dob +
                ", contact=" + contact +
                '}';
    }
}
