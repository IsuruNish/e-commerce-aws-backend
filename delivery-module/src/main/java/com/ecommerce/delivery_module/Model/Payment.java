package com.ecommerce.delivery_module.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private String cardName;
    private String cardNumber;
    private String ExpDate;
    private int CVN;
    private float Fee;
}
