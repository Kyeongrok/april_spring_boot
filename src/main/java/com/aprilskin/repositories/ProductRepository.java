package com.aprilskin.repositories;

import com.aprilskin.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Kyeongrok on 2017-08-01.
 */

@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByProductName(String productName);

    List<Product> findByProductCodeAndItemCode(String productCode, String itemCode);
}
