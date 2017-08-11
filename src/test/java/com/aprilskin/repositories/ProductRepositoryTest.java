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
        product.setProductName("화장품");
        product.setOrderItemQty(5);
        product.setProductCode("P0000C");
        product.setItemCode("000b");
        product.setOwnItemCode("abc");

        productService.saveProduct(product);

        Product productSec = new Product();
        productSec.setProductName("화장품2");
        productSec.setOrderItemQty(5);
        productSec.setProductCode("P0000D");
        productSec.setItemCode("000k");
        productSec.setOwnItemCode("abc");

        productService.saveProduct(productSec);


    }


}