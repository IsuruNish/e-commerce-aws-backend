package com.ecommerce.auth_module.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDao {
    private String cardName;
    private String cardNumber;
    private String ExpDate;
    private int CVN;
    private float Fee;
}
