package com.aprilskin.service;

import com.aprilskin.entities.OrderItem;
import com.aprilskin.entities.Product;
import com.aprilskin.repositories.OrderRepository;
import com.aprilskin.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("OrderItemService")
@Transactional
public class OrderItemImpl implements OrderItemService{

    @Autowired
    private OrderRepository orderRepository;

    public void saveOrderItem(OrderItem orderitem) {
        orderRepository.save(orderitem);
    }

    public List<OrderItem> findAllOrderItems(){
        return orderRepository.findAll();
    }



}
