package com.ecommerce.auth_module.Repository;

import com.ecommerce.auth_module.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerRepository extends JpaRepository<Order, Integer> {
}
