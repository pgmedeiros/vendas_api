package com.example.loja.model.cart;

import java.util.ArrayList;
import java.util.Iterator;

public class FinalOrderForCart {

    private ArrayList<OrderForCart> orderForCarts = new ArrayList<OrderForCart>();

    public ArrayList<OrderForCart> getOrders() {
        return orderForCarts;
    }

    public void setOrdersForCart(OrderForCart orderForCart) {
        this.orderForCarts.add(orderForCart);
    }

    public double getFinalPrice(){
       Iterator<OrderForCart> iteratorOrders = this.orderForCarts.iterator();
       Double finalValue = 0.0;
       while(iteratorOrders.hasNext()){
            OrderForCart orderForCart = iteratorOrders.next();
            finalValue += orderForCart.getProduct().getPrice();
       }
       return finalValue;
    }

    public boolean doOrder(){
        return false;
    };
}
