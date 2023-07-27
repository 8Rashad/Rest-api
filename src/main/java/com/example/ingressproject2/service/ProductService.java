package com.example.ingressproject2.service;

import com.example.ingressproject2.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> productList = new ArrayList<>();

    public List<Product> getAllProducts(){
        return productList;
    }
    public Product getProductById(long id){
        return new Product(8L, "Apple", 1200);
    }

    public Product createProduct(Product product) {
        product.setId(generateProductId());
        productList.add(product);
        return product;
    }

    public Product updateProduct(long id, Product updatedProduct) {
        Product existingProduct = findProductById(id);
        if (existingProduct != null) {
            existingProduct.setName(updatedProduct.getName());
            existingProduct.setPrice(updatedProduct.getPrice());
            return existingProduct;
        } else {
            return null;
        }
    }

    public boolean deleteProduct(long id) {
        Product product = findProductById(id);
        if (product != null) {
            productList.remove(product);
            return true;
        } else {
            return false;
        }
    }

    private Product findProductById(long id) {
        return productList.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
    private long generateProductId() {
        return System.currentTimeMillis();
    }

}
