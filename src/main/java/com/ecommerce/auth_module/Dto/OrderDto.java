package com.ecommerce.buyer_module.Dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderDto {
    private String customerFirstName;
    private String customerLastName;
    private String address;
    private float deliveryPrice;
    private float totalFee;
    private List<Integer> items;
}
