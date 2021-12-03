package com.example.loja;

import com.example.loja.database.ProductsInterface;
import com.example.loja.model.cart.FinalOrderForCart;
import com.example.loja.model.cart.OrderForCart;
import com.example.loja.model.payment.Payment;
import com.example.loja.model.product.Product;
import com.example.loja.process.OrderAndPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class LojaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaApplication.class, args);


	}

}
