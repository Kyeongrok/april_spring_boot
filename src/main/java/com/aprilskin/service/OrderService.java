package com.aprilskin.service;

import com.aprilskin.entities.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kyeongrok on 2017-08-01.
 */
@Service
public class OrderService {
    public List<Product> getProductList(){
        List<Product> list = new ArrayList<>();
        return list;

    }

}
