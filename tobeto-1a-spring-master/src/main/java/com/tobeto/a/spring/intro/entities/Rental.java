package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Table(name = "rentals")
@Entity
@Getter
@Setter
public class Rental {
    @Id
    @Column(name = "rental_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "rental_num")
    private int rentalNum;

    @Column(name = "date_rent")
    private Date dateRent;

    @Column(name = "time_depart")
    private Time timeDepart;

    @Column(name = "time_arrive")
    private Time timeArrive;

    @Column(name = "destination")
    private String destination;

    @Column(name = "date_return")
    private Date dateReturn;

    @Column(name = "payment")
    private String payment;

    @OneToMany(mappedBy = "trans_ID")
    private List<Transaction> transactions;

    @OneToMany(mappedBy = "report_ID")
    private List<Report> reports;

}
