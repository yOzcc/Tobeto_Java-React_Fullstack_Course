package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Table(name = "transactions")
@Entity
public class Transaction {
    @Id
    @Column(name = "trans_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "trans_name")
    private double transName;


    @ManyToOne
    @JoinColumn(name = "rental_id")
    private Rental rental;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "cust_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    @Column(name = "trans_date")
    private Date transDate;

    @OneToMany(mappedBy = "report_ID")
    private List<Report> reports;

}
