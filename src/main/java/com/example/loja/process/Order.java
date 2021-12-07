package com.example.loja.process;

import com.example.loja.model.cart.Cart;
import com.example.loja.model.client.Client;
import com.example.loja.model.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "orders")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Integer id;

    @Column( name = "client_id")
    private Integer clientId;

    @Column( name = "product_id")
    private Integer productId;

    @Column( name = "amount")
    private Integer amount;

    @Column ( name = "order_cod")
    private String cod;


    public Order(Client client, Product product, Integer amount){
        this.clientId = client.getId();
        this.productId = product.getId();
        this.amount = amount;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCod() {
        return cod;
    }
}
