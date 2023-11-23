package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "customers")
@Entity
@Getter
@Setter
public class Customer {
    @Id
    @Column(name = "stud_ID")
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

    @Column(name = "cust_email")
    private String customerEmail;

    @Column(name = "cust_pass")
    private String customerPassword;

    @OneToMany(mappedBy = "cust_ID")
    private List<Transaction> transactions;
}
