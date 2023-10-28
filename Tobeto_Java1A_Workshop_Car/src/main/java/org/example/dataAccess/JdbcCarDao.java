package org.example.dataAccess;

import org.example.entities.Car;

public class JdbcCarDao implements CarDao{
    public void create(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() + " added car database with (JDBC)");
    }

    @Override
    public void delete(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() + " has been deleted from the car database by (JDBC).");
    }

    @Override
    public void update(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() + " has been updated in the car database with (JDBC)");
    }
}
