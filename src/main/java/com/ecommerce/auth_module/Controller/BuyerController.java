package com.ecommerce.auth_module.Controller;

import com.ecommerce.auth_module.Model.Item;
import com.ecommerce.auth_module.Model.Order;
import com.ecommerce.auth_module.Service.BuyerService;
import com.ecommerce.buyer_module.Dto.OrderDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class BuyerController {

    private final BuyerService buyerService;

    public BuyerController(BuyerService buyerService) {
        this.buyerService = buyerService;
    }

    @PostMapping("/buyer-items")
    public ResponseEntity<String> addNewOrder(@RequestBody OrderDto orderDto) {
        Order order = buyerService.addOrder(orderDto);

        for(int itemId : orderDto.getItems()){
            Item item = buyerService.addItem(new Item(order.getOrderID(), itemId));
        }
        return ResponseEntity.ok("Product created successfully");
    }
}
