package com.ecommerce.buyer_module.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int orderID;
    private int itemID;

    public Item(int orderID, int itemID) {
        this.orderID = orderID;
        this.itemID = itemID;
    }
}
