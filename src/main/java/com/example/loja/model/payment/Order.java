package com.example.loja.model.client;

import com.example.loja.process.ProcessOrder;

public class Order {
    public ProcessOrder processOrder;

    public Order(ProcessOrder processOrder) {
        this.processOrder = processOrder;
    }

    public Order() {

    }
}
