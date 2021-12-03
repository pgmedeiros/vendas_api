package com.example.loja.controller;

import com.example.loja.database.ProductsInterface;
import com.example.loja.model.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Properties;

@RestController
public class ControllerAPI {
    @Autowired
    private ProductsInterface productsInterface;

    @GetMapping("/")
    public ResponseEntity main(){
        Product product = new Product();
        product.setName("feijao1");
        product.setCod("1234");
        product.setPrice(12.00);
        productsInterface.save(product);
        return new ResponseEntity("Tudo está funciando por aqui", HttpStatus.OK);
    }

    @GetMapping("/text/{dados}/{dados2}")
    public String retornarResposta(@PathVariable String dados, @PathVariable String dados2){
        return dados + dados2;
    }

    @GetMapping("/parametros")
    public String retornarParametros(@RequestParam("parametro") String parametro){
        return parametro + "fala coisinha";
    }

    /*@PostMapping("/post")
    public ResponseEntity recebendoPost(@RequestBody Pessoa pessoa){
        return new ResponseEntity(pessoa.getNome(), HttpStatus.OK);
    }*/



}
