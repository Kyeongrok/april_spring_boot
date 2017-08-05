package com.aprilskin.repositories;

import com.aprilskin.entities.Product;
import com.aprilskin.service.ProductServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@ActiveProfiles("local")
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
        product.setCode("P00000TF");
        product.setOriginCost(4);
        product.setDescription("test4");
        product.setItemCode("D");
        product.setName("Yjw");
        product.setOriginCost(4);
        product.setOwnItemCode("C1234");
        product.setPrice(1);
        product.setQuentity(1);

        productService.saveProduct(product);



    }
/*
    @Test
    public void findById() throws Exception {
        //Product product = productService.findById(6l);
        //product.setQuentity(2);
        //assertEquals("P00000TA",product.getCode());
        //productService.updateProduct(product);
        //assertEquals("P00000TD",);
    }
*/

}