package com.zikan.PowerUser.model;


import jakarta.persistence.*;

@Entity
@Table (name = "power_user")
public class PowerUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column(name = "first_Name")
    private String firstName;

    @Column(name = "last_Name")
    private String lastName;
    @Column (name = "address")
    private String address;
    @Column (name = "phone_Number")
    private String phoneNumber;

    private String course;

    public PowerUser(){
    }

    public PowerUser(int id, String firstName, String lastName, String address, String phoneNumber, String course) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
