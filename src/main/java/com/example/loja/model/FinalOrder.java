package com.example.loja.model;

import java.util.ArrayList;

public class FinalOrder {

    private ArrayList<Order> orders;

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(Order order) {
        this.orders.add(order);
    }
}
