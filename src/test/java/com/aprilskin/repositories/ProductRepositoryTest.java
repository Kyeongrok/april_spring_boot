package com.aprilskin.repositories;

import com.aprilskin.entities.Product;
import com.aprilskin.service.ProductServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductServiceImpl productService;

    @Test
    public void save() throws Exception {
        Product product = new Product();
        product.setCode("P00000TA");
        product.setOriginCost(4);
        product.setDescription("test3");
        product.setItemCode("C");
        product.setName("yJw");
        product.setOriginCost(4);
        product.setOwnItemCode("C1234");
        product.setPrice(1);
        product.setQuentity(1);

        productRepository.save(product);
        //productService.saveProduct(product);



    }


}