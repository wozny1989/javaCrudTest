package com.wozny.crudtest.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Imie jest wymagane")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "Email jest wymagany")
    @Column(name = "email")
    private String email;

    @Column(name = "phone_no")
    private long phoneNo;

    public Person() {}

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
}
