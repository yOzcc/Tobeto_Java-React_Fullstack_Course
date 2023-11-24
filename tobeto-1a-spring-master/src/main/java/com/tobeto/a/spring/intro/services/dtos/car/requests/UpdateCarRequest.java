package com.tobeto.a.spring.intro.services.dtos.car.requests;

import com.tobeto.a.spring.intro.entities.Driver;
import lombok.Data;
@Data
public class UpdateCarRequest {
    private int id;
    private double rentPrice;
    private String carModel;
    private String carStatus;
    private int carNumber;
    private Driver driverId;
}
