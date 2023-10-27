package org.example;

import org.example.business.BusinessManager;
import org.example.core.logging.*;
import org.example.dataAccess.HibernateCarDao;
import org.example.dataAccess.JdbcCarDao;
import org.example.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{

        Car car = new Car(1, "Renault Symbol","Beyaz", 150000, 2000, false, false, false, 400000);
        Car car1 = new Car(2,"Honda Civic","Gri", 120000, 2013, false, true, true, 650000);
        Car car2 = new Car(3, "Fiat Egea", "Beyaz", 0, 2020, true, true, false,695000);
        Car car3 = new Car(4, "Tofaş", "Beyaz", 350000, 1993, false, false, true, 150000);
        Car car4 = new Car(5, "", "Siyah", 350000, 2013, false, false, true, 250000);


        List<Logger> loggers = new ArrayList<>();
        loggers.add(new FileLogger());
        loggers.add(new DatabaseLogger());
        loggers.add(new SmsLogger());

        List<Logger> loggers1 = new ArrayList<>();
        loggers1.add(new EmailLogger());
        loggers1.add(new SmsLogger());

        BusinessManager businessManager = new BusinessManager(new HibernateCarDao(), loggers);
        // Ekleme başarılı
        businessManager.add(car2);

        // Silme başarılı
        businessManager.delete(car3);

        // Güncelleme başarılı
        businessManager.update(car2);

        BusinessManager businessManager1 = new BusinessManager(new JdbcCarDao(), loggers1);
        // Ekleme başarısız
        businessManager1.add(car);

        // Silme başarısız
        businessManager1.delete(car1);

        // Güncelleme başarısız
        businessManager1.update(car4);
    }
}