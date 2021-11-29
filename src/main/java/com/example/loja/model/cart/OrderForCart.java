package com.example.loja.model.cart;

import com.example.loja.model.product.Product;

public class OrderForCart {

    private Product product;
    private Integer amount;

    public OrderForCart(Product product, Integer amount) {
        this.product = product;
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
