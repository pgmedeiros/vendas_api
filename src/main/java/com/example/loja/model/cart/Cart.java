package com.example.loja.model.cart;

import java.util.ArrayList;
import java.util.Iterator;

public class Cart {

    private ArrayList<ItemForCart> itemForCarts = new ArrayList<ItemForCart>();

    public ArrayList<ItemForCart> getOrders() {
        return itemForCarts;
    }

    public void setItemForCart(ItemForCart itemForCart) {
        this.itemForCarts.add(itemForCart);
    }

    public double getFinalPrice(){
       Iterator<ItemForCart> iteratorOrders = this.itemForCarts.iterator();
       Double finalValue = 0.0;
       while(iteratorOrders.hasNext()){
            ItemForCart itemForCart = iteratorOrders.next();
            finalValue += itemForCart.getProduct().getPrice();
       }
       return finalValue;
    }

    public boolean doOrder(){
        return false;
    };
}
