package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Table(name = "reports")
@Entity
@Getter
@Setter
public class Report {
    @Id
    @Column(name = "report_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "trans_ID")
    private Transaction transaction;

    @ManyToOne
    @JoinColumn(name = "rental_ID")
    private Rental rental;

    @Column(name = "report_date")
    private Date reportDate;
}
