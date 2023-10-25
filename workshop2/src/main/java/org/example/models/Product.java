package org.example.models;

public class Product {
    private String productName;
    private double productPrice;
    private String productImage;
    private int unitsInStock;
    private int discount;

    public Product() {
    }

    public Product(String productName, double productPrice, String productImage, int unitsInStock, int discount) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productImage = productImage;
        this.unitsInStock = unitsInStock;
        this.discount = discount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
