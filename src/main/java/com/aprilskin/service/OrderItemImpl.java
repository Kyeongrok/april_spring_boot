package com.aprilskin.service;

import com.aprilskin.entities.Order;
import com.aprilskin.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Service("OrderItemService")
@Transactional
public class OrderItemImpl implements OrderItemService{

    @Autowired
    private OrderRepository orderRepository;

    public void saveOrderItem(Order orderitem) {
        orderRepository.save(orderitem);
    }

    public List<Order> findAllOrderItems(){
        return orderRepository.findAll();
    }

    public List<Order> findByOrderDatetimeBetween(LocalDateTime startDateTime, LocalDateTime endDateTime) {
        return orderRepository.findByOrderDatetimeBetween(startDateTime, endDateTime);
    }


}
