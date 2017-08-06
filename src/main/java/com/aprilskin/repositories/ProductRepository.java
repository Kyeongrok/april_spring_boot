package com.aprilskin.repositories;

import com.aprilskin.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Kyeongrok on 2017-08-01.
 */

@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByName(String name);
}
