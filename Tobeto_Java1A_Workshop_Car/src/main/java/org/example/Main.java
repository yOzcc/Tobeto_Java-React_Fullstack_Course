package org.example;

import org.example.business.CarManager;
import org.example.core.DatabaseLogger;
import org.example.core.Logger;
import org.example.core.MailLogger;
import org.example.dataAccess.HibernateCarDao;
import org.example.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("Audi","A4 1.4 TFSI sport",2016,"Petrol",
                "Sedan","Black",110,79231,21049);

        List<Logger> loggers = new ArrayList<>();
        loggers.add(new DatabaseLogger());
        loggers.add(new MailLogger());

        CarManager carManager = new CarManager(new HibernateCarDao(), loggers);
        carManager.create(car1);
        carManager.update(car1);
        carManager.delete(car1);
    }
}