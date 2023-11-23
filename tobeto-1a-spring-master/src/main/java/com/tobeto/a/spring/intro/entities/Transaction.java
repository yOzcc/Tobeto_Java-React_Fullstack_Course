package com.tobeto.a.spring.intro.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Table(name = "transactions")
@Entity
@Getter
@Setter
public class Transaction {
    @Id
    @Column(name = "trans_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "trans_name")
    private double transName;


    @ManyToOne
    @JoinColumn(name = "rental_ID")
    private Rental rental;

    @ManyToOne
    @JoinColumn(name = "car_ID")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "cust_ID")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "admin_ID")
    private Admin admin;

    @Column(name = "trans_date")
    private Date transDate;

    @OneToMany(mappedBy = "report_ID")
    private List<Report> reports;

}
