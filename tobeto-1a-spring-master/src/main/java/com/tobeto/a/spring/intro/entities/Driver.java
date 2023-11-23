package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "drivers")
@Entity
@Getter
@Setter
public class Driver {
    @Id
    @Column(name = "driver_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "driver_name")
    private String driverName;

    @Column(name = "commission")
    private String commission;

    @OneToOne
    @JoinColumn(name = "cars_ID")
    private Car car;

}
