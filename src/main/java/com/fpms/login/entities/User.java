package com.fpms.login.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private String emailId;
    private String name;
    private String department;
    private String password;

    public User(String emailId, String name, String department,String password) {
        this.emailId = emailId;
        this.name = name;
        this.department = department;
        this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "User{" +
                "emailId='" + emailId + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    public User(){
        super();
    }
}
