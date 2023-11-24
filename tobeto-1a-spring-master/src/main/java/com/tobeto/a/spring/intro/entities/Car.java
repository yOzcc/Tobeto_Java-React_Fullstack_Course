package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Table(name = "cars")
@Entity
@Getter
@Setter
public class Car {
    @Id
    @Column(name = "car_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "rent_price")
    private double rentPrice;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "car_status")
    private String carStatus;

    @Column(name = "car_number")
    private int carNumber;


    @OneToMany(mappedBy = "trans_ID")
    private List<Transaction> transactions;

    @OneToOne
    @JoinColumn(name = "driver_ID")
    private Driver driver;
}
