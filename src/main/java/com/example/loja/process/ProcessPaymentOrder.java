package com.example.loja.process;

import com.example.loja.model.cart.Cart;
import com.example.loja.model.payment.Order;
import com.example.loja.model.payment.Payment;

public class ProcessPaymentOrder extends Order {

    private Cart cart;
    private Payment payment;

    public ProcessPaymentOrder(Cart cart, Payment payment) {
        super();
        this.cart = cart;
        this.payment = payment;
    }

    public Boolean doOrder(){
        if(analyzeAvailability()){
            return true;
        }else{
            return false;
        }
    }

    public boolean analyzeAvailability(){
        if(this.cart.getFinalPrice() <= this.payment.getCredit()){
            return true;
        }else{
            return false;
        }
    }



}
