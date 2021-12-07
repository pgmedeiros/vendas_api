package com.example.loja.testes;

import com.example.loja.model.cart.Cart;
import com.example.loja.model.client.Client;

public class Session2 {
    private Client client = new Client("Pedro Medeiros", 3, "9999-9999");
    private Cart cart;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Cart createCart(){
        return new Cart();
    }
}
