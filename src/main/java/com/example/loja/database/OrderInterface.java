package com.example.loja.database;
import com.example.loja.process.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderInterface extends JpaRepository<Order, Integer> {
}
