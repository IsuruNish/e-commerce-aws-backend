package com.ecommerce.inventory_module.Dao;

import lombok.Data;

@Data
public class ProductDto {
    private int id;
    private int userId;
    private int quantity;
    private float price;
    private String name;
    private String imgURI;
}
