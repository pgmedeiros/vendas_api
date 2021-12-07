package com.example.loja.process;

import com.example.loja.database.OrderInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Iterator;

public class Orders {

    @Autowired
    private OrderInterface orderInterface;

    private ArrayList<Order> orders = new ArrayList<Order>();

    public Orders() {
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(Order order) {
        orders.add(order);
    }

    public void persist(Order order) {
        /*Iterator<Order> orders = this.orders.iterator();
        while(orders.hasNext()) {
            Order order = orders.next();

        }*/
        order.setCod("abcde");


        orderInterface.save(order);

    }


}
