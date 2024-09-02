package com.ecommerce.auth_module.Service;

import com.ecommerce.auth_module.Model.Item;
import com.ecommerce.auth_module.Model.Order;
import com.ecommerce.auth_module.Repository.BuyerRepository;
import com.ecommerce.auth_module.Repository.ItemRepository;
import com.ecommerce.buyer_module.Dto.OrderDto;
import org.springframework.stereotype.Service;

@Service
public class BuyerService {
    private final BuyerRepository buyerRepository;
    private final ItemRepository itemRepository;

    public BuyerService(BuyerRepository buyerRepository, ItemRepository itemRepository) {
        this.buyerRepository = buyerRepository;
        this.itemRepository = itemRepository;
    }

    public Order addOrder(OrderDto orderDto) {
        Order order = new Order(
                orderDto.getCustomerFirstName(),
                orderDto.getCustomerLastName(),
                orderDto.getAddress(),
                orderDto.getDeliveryPrice(),
                orderDto.getTotalFee()
        );

        return buyerRepository.save(order);
    }

    public Item addItem(Item item) {
        return itemRepository.save(item);
    }
}
