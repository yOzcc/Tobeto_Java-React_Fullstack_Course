package com.tobeto.a.spring.intro.services.dtos.rental.requests;

import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Data
public class AddRentalRequest {
    private int id;
    private int rentalNum;
    private Date dateRent;
    private Time timeDepart;
    private Time timeArrive;
    private String destination;
    private Date dateReturn;
    private String payment;
}
