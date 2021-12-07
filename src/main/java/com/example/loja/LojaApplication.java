package com.example.loja;

import com.example.loja.database.ProductsInterface;
import com.example.loja.model.cart.Cart;
import com.example.loja.model.cart.CartFactory;
import com.example.loja.model.cart.ItemForCart;
import com.example.loja.model.cart.ItemForCartFactory;
import com.example.loja.model.client.Client;
import com.example.loja.model.payment.Payment;
import com.example.loja.model.product.Product;
import com.example.loja.process.ProcessPaymentOrder;
import com.example.loja.testes.Session2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LojaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaApplication.class, args);
	}


}
