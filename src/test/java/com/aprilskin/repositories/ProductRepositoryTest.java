package com.aprilskin.repositories;

import com.aprilskin.entities.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("local")
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void save() throws Exception {
        Product product = new Product();
        product.setCode("P00000TV");
        product.setOriginCost(2);

        productRepository.save(product);
    }

    @Test
    public void find() throws Exception {

        Product product = new Product();
        product.setCode("P00000TV");
        product.setOriginCost(2);

        productRepository.save(product);

        Product selectedProduct = productRepository.findOne(0l);
        assertEquals("P00000TV", selectedProduct.getCode());
    }
}