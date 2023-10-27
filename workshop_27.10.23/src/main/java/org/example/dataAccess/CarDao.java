package org.example.dataAccess;

import org.example.entities.Car;

import java.util.List;

public interface CarDao {
    void add(Car car);
    void delete(Car car);
    void update(Car car);
}
