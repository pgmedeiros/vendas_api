package com.example.loja.process;

import com.example.loja.model.cart.FinalOrderForCart;
import com.example.loja.model.payment.Payment;

public class OrderAndPayment {

    private FinalOrderForCart finalOrderForCart;
    private Payment payment;

    public OrderAndPayment(FinalOrderForCart finalOrderForCart, Payment payment) {
        this.finalOrderForCart = finalOrderForCart;
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
        if(this.finalOrderForCart.getFinalPrice() <= this.payment.getCredit()){
            return true;
        }else{
            return false;
        }
    }



}
