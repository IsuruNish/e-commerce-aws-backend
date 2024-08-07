package com.ecommerce.buyer_module.Repository;

import com.ecommerce.buyer_module.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
