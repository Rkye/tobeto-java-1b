package com.tobeto.workshop1.b.pair7;

public class Product {
    private int id;
    private String name;
    private int price;
    private String categoryName;

    public Product() {
    }

    public Product(int id, String name, int price, String categoryName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.categoryName = categoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
