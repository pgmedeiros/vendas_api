package com.example.loja;

import com.example.loja.model.cart.FinalOrderForCart;
import com.example.loja.model.cart.OrderForCart;
import com.example.loja.model.payment.Payment;
import com.example.loja.model.product.Product;
import com.example.loja.process.OrderAndPayment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LojaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaApplication.class, args);
		Product product = new Product("Feijão", "12345", 12.0);
		OrderForCart orderForCart = new OrderForCart(product, 4);
		FinalOrderForCart finalOrderForCart = new FinalOrderForCart();
		finalOrderForCart.setOrdersForCart(orderForCart);
		Payment payment = new Payment();
		Boolean process = new OrderAndPayment(finalOrderForCart, payment).analyzeAvailability();
		System.out.println(process);
		//adiciona pedido ao banco de dados
		// realiza despacho
	}

}
