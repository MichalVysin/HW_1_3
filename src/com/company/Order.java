package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderNumber;
    private Table tableNumber;
    private LocalDate date;
    private Payment payment;
    private List<Item> orderList;

    public Order(int orderNumber, Table tableNumber, LocalDate date, Payment payment, List<Item> orderList) {
        this.orderNumber = orderNumber;
        this.tableNumber = tableNumber;
        this.date = date;
        this.payment = payment;
        this.orderList = orderList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Table getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Table tableNumber) {
        this.tableNumber = tableNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public List<Item> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Item> orderList) {
        this.orderList = orderList;
    }

}
