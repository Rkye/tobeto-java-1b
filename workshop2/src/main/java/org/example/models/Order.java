package org.example.models;

public class Order {
    private String orderNo;
    private String orderDate;
    private int unitsOrder;

    public Order() {
    }

    public Order(String orderNo, String orderDate, int unitsOrder) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.unitsOrder = unitsOrder;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getUnitsOrder() {
        return unitsOrder;
    }

    public void setUnitsOrder(int unitsOrder) {
        this.unitsOrder = unitsOrder;
    }
}
