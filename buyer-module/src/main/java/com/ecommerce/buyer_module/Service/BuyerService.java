package com.ecommerce.buyer_module.Service;

import com.ecommerce.buyer_module.Dto.OrderDto;
import com.ecommerce.buyer_module.Model.Item;
import com.ecommerce.buyer_module.Model.Order;
import com.ecommerce.buyer_module.Repository.BuyerRepository;
import com.ecommerce.buyer_module.Repository.ItemRepository;
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
