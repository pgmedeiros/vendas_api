package com.example.loja.database;

import com.example.loja.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsInterface extends JpaRepository<Product, Integer> {

}
