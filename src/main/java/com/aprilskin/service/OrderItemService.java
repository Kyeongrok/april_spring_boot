package com.aprilskin.service;

import com.aprilskin.entities.Order;

import java.time.LocalDateTime;
import java.util.List;


public interface OrderItemService {

    List<Order> findByOrderDatetimeBetween(LocalDateTime startDateTime, LocalDateTime endDateTime);

    void saveOrderItem(Order order);

    List<Order> findAllOrderItems();


}
