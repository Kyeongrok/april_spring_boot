package com.aprilskin.repositories;

import com.aprilskin.entities.Order;
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
public class OrderRepositoryTest {

    @Autowired
    private OrderRepository orderRepository;

    @Test
    public void insert() throws Exception {
        Order order = new Order();
        order.setName("hello");
        orderRepository.save(order);

    }

    @Test
    public void select() throws Exception {
        Order order = orderRepository.findOne(1l);
        System.out.println(order);
    }
}