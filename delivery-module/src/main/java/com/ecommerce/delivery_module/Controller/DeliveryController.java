package com.ecommerce.delivery_module.Controller;

import com.ecommerce.delivery_module.Dao.PaymentDao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {
    @GetMapping("/")
    public ResponseEntity<Map<String, Integer>> getDeliveryPrice(){
        Map<String, Integer> result = new HashMap<>();
        result.put("deliveryPrice", 500);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/payment")
    public ResponseEntity<Map<String, String>> makePayemnt(@RequestBody PaymentDao paymentDao){
        Map<String, String> result = new HashMap<>();
        result.put("data", "Payment Successful");
        return ResponseEntity.ok(result);
    }

}
