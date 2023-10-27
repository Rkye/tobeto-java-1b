package org.example.dataAccess;

import org.example.entities.Car;

public class HibernateCarDao implements CarDao{
    @Override
    public void add(Car car) {
        System.out.println(car.getId() + " idli " + car.getBrand()
                + " marka araç, Hibernate ile db ye kaydedildi." );
    }

    @Override
    public void delete(Car car) {
        System.out.println(car.getId() + " idli araç Hibernate ile db den silindi.");
    }

    @Override
    public void update(Car car) {
        System.out.println(car.getId() + " idli " + car.getBrand()
                + " marka araç, Hibernate ile db de güncellendi.");
    }
}
