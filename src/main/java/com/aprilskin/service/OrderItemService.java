package com.aprilskin.service;

import com.aprilskin.entities.Order;

import java.util.List;

public interface OrderItemService {


    void saveOrderItem(Order order);

    List<Order> findAllOrderItems();


}
