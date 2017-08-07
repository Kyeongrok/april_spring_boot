package com.aprilskin.service;

import com.aprilskin.entities.OrderItem;
import com.aprilskin.repositories.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("OrderItemService")
@Transactional
public class OrderItemImpl implements OrderItemService{

    @Autowired
    private OrderItemRepository orderItemRepository;

    public void saveOrderItem(OrderItem orderitem) {
        orderItemRepository.save(orderitem);
    }

    public List<OrderItem> findAllOrderItems(){
        return orderItemRepository.findAll();
    }



}
