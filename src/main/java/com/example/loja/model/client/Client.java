package com.example.loja.model.client;

import com.example.loja.model.payment.Order;

import java.util.ArrayList;

public class Client {

    private String name;
    private String adress;
    private String phoneNumber;
    private ArrayList<Order> orders = new ArrayList<Order>();

    public Client(String name, String adress, String phoneNumber) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(Order order) {
        orders.add(order);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
