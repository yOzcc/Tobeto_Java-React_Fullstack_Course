package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "admins")
@Entity
public class Admin {
    @Id
    @Column(name = "admin_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fname")
    private String fName;

    @Column(name = "lname")
    private String lName;

    @Column(name = "gender")
    private int gender;

    @Column(name = "age")
    private int age;

    @Column(name = "contact_add")
    private int contactAddress;

    @Column(name = "admin_email")
    private String adminEmail;

    @Column(name = "admin_pass")
    private String adminPassword;

    @OneToMany(mappedBy = "admin_ID")
    private List<Transaction> transactions;
}
