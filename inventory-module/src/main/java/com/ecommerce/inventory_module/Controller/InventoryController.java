package com.ecommerce.inventory_module.Controller;

import com.ecommerce.inventory_module.Dao.ProductDto;
import com.ecommerce.inventory_module.Model.Product;
import com.ecommerce.inventory_module.Service.InventoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class InventoryController {
    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> products = inventoryService.getProducts();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Product>> getAllProductsByUserId(@PathVariable("id") int userId) {
        List<Product> products = inventoryService.getProductByUserId(userId);
        return ResponseEntity.ok(products);
    }

    @PostMapping("/")
    public ResponseEntity<Product> addNewProduct(@RequestBody ProductDto productDto) {
        Product product = inventoryService.addProduct(productDto);
        return ResponseEntity.ok(product);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@RequestBody ProductDto productDto, @PathVariable("id") int productId) {
        Product product = inventoryService.updateProduct(productDto, productId);
        return ResponseEntity.ok(product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") int productId) {
        inventoryService.deleteProduct(productId);
        return ResponseEntity.ok("Product with the ID " + productId + " is deleted");
    }


    //todo: do this
    @PostMapping("/checkout")
    public ResponseEntity<Product> updateInventory(@RequestBody ProductDto productDto) {
//        Product product = inventoryService.updateProduct(productDto);
//        return ResponseEntity.ok(product);
    }

}
