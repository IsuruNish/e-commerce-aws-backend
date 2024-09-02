package com.ecommerce.auth_module.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderID;
    private String customerFirstName;
    private String customerLastName;
    private String address;
    private float deliveryPrice;
    private float totalFee;
    private List<Integer> items;

    public Order(String customerFirstName, String customerLastName, String address, float deliveryPrice, float totalFee) {
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.address = address;
        this.deliveryPrice = deliveryPrice;
        this.totalFee = totalFee;
    }
}
