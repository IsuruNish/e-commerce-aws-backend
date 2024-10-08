package com.ecommerce.auth_module.Repository;

import com.ecommerce.auth_module.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface InventoryRepository extends JpaRepository<Product, Integer> {
    ArrayList<Product> findByUserId(int userId);
}
