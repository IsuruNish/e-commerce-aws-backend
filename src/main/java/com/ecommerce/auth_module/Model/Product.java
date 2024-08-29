package com.ecommerce.auth_module.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int userId;
    private int quantity;
    private float price;
    private String name;
    private String imgURI;

    public Product(int userId, int quantity, float price, String name, String imgURI) {
        this.userId = userId;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.imgURI = imgURI;
    }
}
