package com.example.loja.model.payment;

import com.example.loja.process.ProcessPaymentOrder;

public class Order {
    public ProcessPaymentOrder processPaymentOrder;

    public Order(ProcessPaymentOrder processPaymentOrder) {
        this.processPaymentOrder = processPaymentOrder;
    }

    public Order() {

    }
}
