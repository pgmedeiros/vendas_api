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

    @GetMapping("/produtos")
    public ResponseEntity main(){
        //retorna lista de produtos
        return null;
    }

    @GetMapping("/produtos/{id}")
    public ResponseEntity retornarResposta()
    {
        //retorna dados específicos de certo produto
        return null;
    }

    @PostMapping("/pedido")
    public ResponseEntity retornarParametros(){
        //faz pedido
        return null;
    }

}
