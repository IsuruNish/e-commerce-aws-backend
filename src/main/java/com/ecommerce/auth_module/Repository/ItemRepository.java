package com.ecommerce.auth_module.Repository;

import com.ecommerce.auth_module.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
