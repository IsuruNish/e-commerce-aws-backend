package com.ecommerce.buyer_module.Repository;

import com.ecommerce.buyer_module.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerRepository extends JpaRepository<Order, Integer> {
}
