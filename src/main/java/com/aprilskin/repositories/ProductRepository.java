package com.aprilskin.repositories;

import com.aprilskin.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Kyeongrok on 2017-08-01.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
