package com.example.loja.process;

import com.example.loja.model.cart.FinalOrderForCart;
import com.example.loja.model.payment.Payment;

public class OrderAndPayment {

    private FinalOrderForCart finalOrderForCart;
    private Payment payment;

    public boolean analyzeAvailability(FinalOrderForCart finalOrderForCart, Payment payment){
        if(finalOrderForCart.getFinalPrice() <= payment.getCredit()){
            return true;
        }else{
            return false;
        }
    }



}
