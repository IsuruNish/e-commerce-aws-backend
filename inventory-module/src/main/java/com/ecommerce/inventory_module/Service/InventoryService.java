package com.ecommerce.inventory_module.Service;

import com.ecommerce.inventory_module.Dao.ProductDto;
import com.ecommerce.inventory_module.Model.Product;
import com.ecommerce.inventory_module.Repository.InventoryRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public List<Product> getProducts(){
        return inventoryRepository.findAll();
    }

    public List<Product> getProductByUserId(int userId){
        return inventoryRepository.findByUserId(userId);
    }

    public Product addProduct(ProductDto productDto){
        Product product = new Product(
                productDto.getUserId(),
                productDto.getQuantity(),
                productDto.getPrice(),
                productDto.getName(),
                productDto.getImgURI()
        );
        return inventoryRepository.save(product);
    }

    public Product updateProduct(ProductDto productDto, int productId){
        Product product = inventoryRepository.findById(productId).orElseThrow(() -> new RuntimeException("Item not found"));
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        product.setQuantity(productDto.getQuantity());
        product.setImgURI(productDto.getImgURI());

        return inventoryRepository.save(product);
    }

    public void deleteProduct(int productId){
        inventoryRepository.deleteById(productId);
    }
}
