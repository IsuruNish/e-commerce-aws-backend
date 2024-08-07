package com.ecommerce.buyer_module.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "items")
public class Item {
    private int orderID;
    private int itemID;

    public Item(int orderID, int itemID) {
        this.orderID = orderID;
        this.itemID = itemID;
    }
}
