package org.example.business;

import org.example.core.Logger;
import org.example.dataAccess.CarDao;
import org.example.entities.Car;
import java.util.Calendar;
import java.time.Year;

import java.util.List;


public class CarManager {
    private CarDao carDao;
    private List<Logger> loggers;


    public CarManager(CarDao carDao,List<Logger> loggers){
        this.carDao = carDao;
        this.loggers = loggers;
    }

    public void create(Car car) throws Exception {
        if(car.getBrand().length()<1){
            throw new Exception("The car brand cannot be less than 2 letters.");
        }
        if(car.getModel().length()<0){
            throw new Exception("The car model cannot be less than 1 letters.");
        }
        if(car.getIntroductionYear()>Year.now().getValue()+1){
            throw new Exception("The car's introduction year cannot be greater than the current year.");
        }
        if(car.getFuelType().length()<0 || car.getBodyStyle().length()<0 || car.getColor().length()<0){
            throw new Exception("The fuel type, body style and color field cannot be left blank.");
        }
        if(car.getPower()<0){
            throw new Exception("The power of the car cannot be less than 0.");
        }
        if(car.getMileAge()<0){
            throw new Exception("The mileage of the car cannot be less than 0.");
        }
        if(car.getCarPrice()<100){
            throw new Exception("The price of the car cannot be less than 100.");
        }
        carDao.create(car);

        for(Logger logger : loggers){
            logger.log(car.getBrand());
        }
    }

    public void delete(Car car){
        carDao.delete(car);

        for(Logger logger : loggers){
            logger.log(car.getBrand());
        }
    };

    public void update (Car car){
        carDao.update(car);

        for(Logger logger : loggers){
            logger.log(car.getBrand());
        }
    };


}
