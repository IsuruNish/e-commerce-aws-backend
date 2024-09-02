package com.ecommerce.auth_module.Dto;

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
