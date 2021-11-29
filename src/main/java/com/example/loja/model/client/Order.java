package com.example.loja.model.client;

import com.example.loja.process.OrderAndPayment;

public class Order {
    public OrderAndPayment orderAndPayment;

    public Order(OrderAndPayment orderAndPayment) {
        this.orderAndPayment = orderAndPayment;
    }
}
