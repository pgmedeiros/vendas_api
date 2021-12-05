package com.example.loja;

import com.example.loja.database.ProductsInterface;
import com.example.loja.model.cart.Cart;
import com.example.loja.model.cart.ItemForCart;
import com.example.loja.model.cart.ItemForCartFactory;
import com.example.loja.model.client.Client;
import com.example.loja.model.payment.Payment;
import com.example.loja.model.product.Product;
import com.example.loja.process.ProcessOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LojaApplication {

	private static Client client = new Client("PEDRO", "JAPÃO", "99999");
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
		Cart cart = new Cart(); // o cart será pego da sessão, cada sessão terá seu próprio cart
		Integer amount = 2;
		//Product product = productsInterface.getById(2L);
		Product product = new Product();
		product.setName("feijao");
		product.setPrice(5.00);

		ItemForCart itemForCart = ItemForCartFactory.createItemForCart(product, amount);
		cart.setItemForCart(itemForCart);
		Payment payment = new Payment();
		ProcessOrder processOrder = new ProcessOrder(cart, payment);
		if(processOrder.analyzeAvailability()){
			client.setOrders(processOrder);
			System.out.println("A compra foi realizada");
		}else{
			System.out.println("A compra não pôde ser realizada");
		}

	}

}
