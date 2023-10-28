package org.example.dataAccess;

import org.example.entities.Car;

public interface CarDao {
    public void create(Car car);
    public void delete(Car car);
    public void update(Car car);
}
