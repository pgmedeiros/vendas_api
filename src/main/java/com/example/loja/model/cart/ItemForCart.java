package com.example.loja.model.cart;

import com.example.loja.model.product.Product;
import org.springframework.stereotype.Component;

@Component
public class ItemForCart {

    private Product product;
    private Integer amount;

    public ItemForCart(Product product, Integer amount) {
        this.product = product;
        this.amount = amount;
    }

    public ItemForCart(){

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
