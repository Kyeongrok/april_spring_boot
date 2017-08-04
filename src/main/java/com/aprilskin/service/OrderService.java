package com.aprilskin.service;

import com.aprilskin.entities.Product;
import com.aprilskin.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kyeongrok on 2017-08-01.
 */
@Service
public class OrderService {

    @Autowired
    private ProductRepository productRepository;


    public List<Product> getProductList(){
        List<Product> list = productRepository.findAll();
        return list;
    }

    public void deleteItem(long id){
        productRepository.delete(id);
    }

}
