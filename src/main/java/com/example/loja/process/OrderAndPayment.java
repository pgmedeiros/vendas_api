package com.example.loja.process;

import com.example.loja.model.order.FinalOrder;
import com.example.loja.model.payment.Payment;

public class OrderAndPayment {

    private FinalOrder finalOrder;
    private Payment payment;

    public boolean analyzeAvailability(FinalOrder finalOrder, Payment payment){
        if(finalOrder.getFinalPrice() <= payment.getCredit()){
            return true;
        }else{
            return false;
        }
    }



}
