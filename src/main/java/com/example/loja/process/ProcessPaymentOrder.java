package com.example.loja.process;

import com.example.loja.model.payment.Payment;

public class ProcessPaymentOrder{

    private String status;
    private Order order;
    private Payment payment;

    public ProcessPaymentOrder(Order order, Payment payment) {
        this.order = order;
        this.payment = payment;
        this.status = "PPP";
    }

    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }



}
