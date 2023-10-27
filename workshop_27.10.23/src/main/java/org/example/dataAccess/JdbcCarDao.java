package org.example.dataAccess;

import org.example.entities.Car;

public class JdbcCarDao implements CarDao{

    @Override
    public void add(Car car) {
        System.out.println(car.getId() + " idli " + car.getBrand()
               + " marka araç, JDBC ile db ye kaydedildi." );
    }

    @Override
    public void delete(Car car) {
        System.out.println(car.getId() + " idli araç JDBC ile db den silindi.");
    }

    @Override
    public void update(Car car) {
        System.out.println(car.getId() + " idli " + car.getBrand()
                + " marka araç, JDBC ile db de güncellendi.");
    }
}
