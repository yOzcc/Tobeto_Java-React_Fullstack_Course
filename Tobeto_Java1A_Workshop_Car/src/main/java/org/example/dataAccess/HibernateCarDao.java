package org.example.dataAccess;

import org.example.entities.Car;

public class HibernateCarDao implements CarDao{
    @Override
    public void create(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() + " added car database with (Hibernate)");
    }

    @Override
    public void delete(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() + " has been deleted from the car database by (Hibernate).");
    }

    @Override
    public void update(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() + " has been updated in the car database with (Hibernate)");
    }
}
