package com.aprilskin.service;

import com.aprilskin.entities.OrderItem;
import com.aprilskin.entities.Product;

import java.util.List;

public interface OrderItemService {


    void saveOrderItem(OrderItem orderItem);

    List<OrderItem> findAllOrderItems();


}
