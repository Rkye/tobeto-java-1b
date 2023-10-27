package org.example.business;

import org.example.core.logging.Logger;
import org.example.dataAccess.CarDao;
import org.example.entities.Car;

import java.util.List;

public class BusinessManager {
    private CarDao carDao;
    private List<Logger> loggers;

    public BusinessManager(CarDao carDao, List<Logger> loggers)  {
        this.carDao = carDao;
        this.loggers = loggers;
    }

    public void add(Car car) throws Exception {
        if(car.getKm() == 0 && car.isNewCar() && car.getUnitPrice() < 700000){
            carDao.add(car);
        }
        else if(!car.isNewCar() && car.getKm() < 150000 && !car.isDamage() && car.getUnitPrice() < 450000){
            carDao.add(car);
        }
        else {
            throw new Exception(car.getBrand() + " markalı aracın fiyatı " + car.getUnitPrice()
                    + " den büyük olamaz.");
        }
        for (Logger logs:loggers) {
            logs.log(car.getBrand() + " eklendi.");
        }

    }

    public void delete(Car car) throws Exception{
        if(car.isDamage() && car.getModelYear() < 2000){
            carDao.delete(car);
        }
        else {
            throw new Exception("Hasarsız ve 2000 modelden büyük olan araçlar silinemez.");
        }
        for (Logger logs:loggers) {
            logs.log(car.getBrand() + " silindi.");
        }
    }

    public void update(Car car) throws Exception{
        if(car.getBrand().isBlank()){
            throw new Exception("İsim boş geçilemez.");
        }
        carDao.update(car);
        for (Logger logs:loggers) {
            logs.log(car.getBrand() + " güncellendi.");
        }
    }

}
