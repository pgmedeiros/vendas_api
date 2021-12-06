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

	@Autowired
	private ProductsInterface productsInterface;
	@Autowired
	private ItemForCart itemForCart;



	public static void main(String[] args) {
		SpringApplication.run(LojaApplication.class, args);
		main();
	}

	public static void main(){
	/*

		==================================== realização de pedido ========================================

	*/
		// buscar produto pelo id
		// adicionar ao carrinho
		// fechar carrinho
		// fazer pedido
			// se aprovado, adicionar pedido em client
			// se não, recusar pedido

		//simulando session
		Session2 session2 = new Session2();
		Client client = session2.getClient();
		Cart cart = CartFactory.createCart(); // o cart será pego da sessão, cada sessão terá seu próprio cart

		//adicionando item no carrinho
		Integer amount = 2;
		//Product product = productsInterface.getById(2L);
		Product product = new Product();
		product.setName("feijao");
		product.setPrice(5.00);
		ItemForCart itemForCart = ItemForCartFactory.createItemForCart(product, amount);
		cart.setItemForCart(itemForCart);

		//fazendo pedido
		Payment payment = new Payment();
		ProcessPaymentOrder order = new ProcessPaymentOrder(cart, payment);
		if(order.analyzeAvailability()){
			client.setOrders(order);
			System.out.println("A compra foi realizada");

		}else{
			System.out.println("A compra não pode ser realizada");
		}

	}

}
