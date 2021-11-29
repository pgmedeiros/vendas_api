package com.example.loja.model.order;

import java.util.ArrayList;
import java.util.Iterator;

public class FinalOrder {

    private ArrayList<Order> orders = new ArrayList<Order>();

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(Order order) {
        this.orders.add(order);
    }

    public double getFinalPrice(){
       Iterator<Order> iteratorOrders = this.orders.iterator();
       Double finalValue = 0.0;
       while(iteratorOrders.hasNext()){
            Order order = iteratorOrders.next();
            finalValue += order.getProduct().getPrice();
       }
       return finalValue;
    }
}
