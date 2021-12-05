package com.example.loja.model.cart;

import com.example.loja.model.product.Product;

public class ItemForCartFactory {

    public static ItemForCart createItemForCart(Product product, Integer amount){
        return new ItemForCart(product, amount);
    }


}
