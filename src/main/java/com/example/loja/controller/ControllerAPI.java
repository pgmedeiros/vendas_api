package com.example.loja.controller;


import com.example.loja.database.OrderInterface;
import com.example.loja.database.ProductsInterface;
import com.example.loja.model.cart.Cart;
import com.example.loja.model.cart.CartFactory;
import com.example.loja.model.client.Client;
import com.example.loja.model.product.Product;
import com.example.loja.process.Order;
import com.example.loja.process.Orders;
import com.example.loja.testes.Session2;
import org.hibernate.query.criteria.internal.OrderImpl;
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
        product.setId(1);

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


/*


		==================================== realização de pedido ========================================


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
 */