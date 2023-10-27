package org.example.entities;

public class Car {
    private int id;
    private String brand;
    private String color;
    private double km;
    private int modelYear;
    private boolean isNewCar;
    private boolean isAutomatic;
    private boolean isDamage;
    private double unitPrice;

    public Car() {
    }

    public Car(int id, String brand, String color, double km, int modelYear, boolean isNewCar, boolean isAutomatic, boolean isDamage, double unitPrice) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.km = km;
        this.modelYear = modelYear;
        this.isNewCar = isNewCar;
        this.isAutomatic = isAutomatic;
        this.isDamage = isDamage;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public boolean isNewCar() {
        return isNewCar;
    }

    public void setNewCar(boolean newCar) {
        isNewCar = newCar;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public boolean isDamage() {
        return isDamage;
    }

    public void setDamage(boolean damage) {
        isDamage = damage;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
