package com.aprilskin.service;

import com.aprilskin.entities.Product;

import java.util.List;

public interface ProductService {

    Product findById(Long id);

    Product findByProductName(String productName);

    void saveProduct(Product product);

    void updateProduct(Product product);

    void deleteProductById(Long id);

    void deleteAllProducts();

    List<Product> findAllProducts();

    boolean isProductExist(Product product);

}
