package org.example.entities;

public class Car {
    private String brand;
    private String model;
    private int introductionYear;
    private String fuelType;
    private String bodyStyle;
    private String color;
    private int power;
    private int mileAge;
    private double carPrice;

    public Car() {
    }

    public Car(String brand, String model, int introductionYear, String fuelType, String bodyStyle, String color, int power, int mileAge, double carPrice) {
        this.brand = brand;
        this.model = model;
        this.introductionYear = introductionYear;
        this.fuelType = fuelType;
        this.bodyStyle = bodyStyle;
        this.color = color;
        this.power = power;
        this.mileAge = mileAge;
        this.carPrice = carPrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getIntroductionYear() {
        return introductionYear;
    }

    public void setIntroductionYear(int introductionYear) {
        this.introductionYear = introductionYear;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMileAge() {
        return mileAge;
    }

    public void setMileAge(int mileAge) {
        this.mileAge = mileAge;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }
}
