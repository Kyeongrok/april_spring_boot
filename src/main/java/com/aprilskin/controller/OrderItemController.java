package com.aprilskin.controller;


import com.aprilskin.entities.OrderItem;
import com.aprilskin.entities.Product;
import com.aprilskin.repositories.OrderRepository;
import com.aprilskin.repositories.ProductRepository;
import com.aprilskin.schedule.Cafe24ApiCallScheduled;
import com.aprilskin.service.OrderItemService;
import com.aprilskin.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.misc.Request;

import java.util.List;

@RestController
@RequestMapping({"/aprilskin/v1/order"})
@CrossOrigin(origins = "*")
@Slf4j
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @Autowired
    private OrderRepository orderRepository;

    // >>>>>>>>>>>>>>>>>>>>>> Retrieve all OrderItems  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity getListAll() throws Exception {

        List<OrderItem> orderItems = orderItemService.findAllOrderItems();
        if (orderItems.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<OrderItem>>(orderItems, HttpStatus.OK);
    }

}
