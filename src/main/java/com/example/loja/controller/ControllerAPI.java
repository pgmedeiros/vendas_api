package com.example.loja.controller;


import com.example.loja.database.ProductsInterface;
import com.example.loja.model.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAPI {
    @Autowired
    private ProductsInterface productsInterface;
    @Autowired

    @GetMapping("/produtos")
    public ResponseEntity main(){
        Product product = new Product();
        product.setName("SMARTPHONE 02");
        product.setPrice(252.00);
        productsInterface.save(product);
        return null;
    }
}
