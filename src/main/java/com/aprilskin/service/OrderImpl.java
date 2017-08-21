package com.aprilskin.service;

import com.aprilskin.entities.Order;
import com.aprilskin.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Service("OrderService")
@Transactional
public class OrderImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void saveOrder(Order order) {
        orderRepository.save(order);
    }

    public List<Order> findAllOrder(){
        return orderRepository.findAll();
    }

    public List<Order> findByOrderDatetimeBetweenAndShopType(LocalDateTime startDateTime, LocalDateTime endDateTime, int shoptype) {
        return orderRepository.findByOrderDatetimeBetweenAndShopType(startDateTime, endDateTime, shopType);
    }




}
