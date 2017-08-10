package com.aprilskin.repositories;

import com.aprilskin.entities.Product;
import com.aprilskin.service.ProductService;
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
    ProductRepository productRepository;

    @Autowired
    ProductService productService;

    @Test
    public void save() throws Exception {
        Product product = new Product();
        //product.setId(1);
        product.setProductName("매직스톤");
        product.setOrderItemQty(5);
        product.setProductCode("P0000A");
        product.setItemCode("000M");
        product.setOwnItemCode("abc");

        productService.saveProduct(product);

        Product productSec = new Product();
        //productSec.setId(2);
        productSec.setProductName("매직스톤2");
        productSec.setOrderItemQty(5);
        productSec.setProductCode("P0000B");
        productSec.setItemCode("000M");
        productSec.setOwnItemCode("abc");

        productService.saveProduct(productSec);


    }


}