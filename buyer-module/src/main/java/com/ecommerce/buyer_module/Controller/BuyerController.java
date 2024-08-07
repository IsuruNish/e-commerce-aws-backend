package com.ecommerce.buyer_module.Controller;

import com.ecommerce.buyer_module.Dto.OrderDto;
import com.ecommerce.buyer_module.Model.Item;
import com.ecommerce.buyer_module.Model.Order;
import com.ecommerce.buyer_module.Service.BuyerService;
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
