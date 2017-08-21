package com.aprilskin.service;

import com.aprilskin.entities.Order;
import com.aprilskin.entities.OrderProduct;

import java.time.LocalDateTime;
import java.util.List;


public interface OrderService {

    List<Order> findByOrderDatetimeBetweenAndShopType(LocalDateTime startDateTime, LocalDateTime endDateTime,
                                                      int shopType);

    void saveOrder(Order order);

    List<Order> findAllOrder();



}
