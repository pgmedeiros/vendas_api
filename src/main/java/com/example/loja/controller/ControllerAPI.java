package com.example.loja.controller;


import com.example.loja.database.OrderInterface;
import com.example.loja.database.ProductsInterface;
import com.example.loja.model.client.Client;
import com.example.loja.model.product.Product;
import com.example.loja.process.Order;
import com.example.loja.process.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAPI {
    @Autowired
    private ProductsInterface productsInterface;
    @Autowired
    private OrderInterface orderInterface;

    @GetMapping("/")
    public ResponseEntity get(){
        return new ResponseEntity("Server is run", HttpStatus.OK);
    }
    @GetMapping("/produtos")
    public void main(){

        Client client = new Client("pedro", 2, "999999");
        client.setId(1);

        Product product = new Product();
        product.setName("SMARTPHONE 03");
        product.setPrice(252.00);
        product.setId(2);

        Product product2 = new Product();
        product2.setName("MURIÇOCA");
        product2.setPrice(15.00);
        product2.setId(3);


        Order order1 = new Order(client,product, 4);
        Order order2 = new Order(client,product2, 3);
        order1.setCod("abcde");

        Orders orders = new Orders();
        orders.setOrders(order1);
        orders.setOrders(order2);
        orderInterface.save(order1);
        System.out.println("O código foi executado");


    }
}


