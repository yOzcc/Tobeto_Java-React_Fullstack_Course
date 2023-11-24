package com.tobeto.a.spring.intro.services.dtos.admin.requests;

import lombok.Data;

@Data
public class AddAdminRequest {
    private int id;
    private String fname;
    private String lname;
    private int gender;
    private int age;
    private int contactAdd;
    private String adminEmail;
    private String adminPassword;
}
