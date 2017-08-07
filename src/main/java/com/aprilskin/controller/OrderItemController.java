package com.aprilskin.controller;


import com.aprilskin.entities.OrderItem;
import com.aprilskin.entities.Product;
import com.aprilskin.entities.TimeOrderItem;
import com.aprilskin.repositories.OrderRepository;
import com.aprilskin.repositories.ProductRepository;
import com.aprilskin.schedule.Cafe24ApiCallScheduled;
import com.aprilskin.service.OrderItemService;
import com.aprilskin.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;
import sun.misc.Request;

import java.time.LocalDateTime;
import java.util.ArrayList;
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
    public ResponseEntity getListAllOrderItems() throws Exception {

        List<OrderItem> orderItems = orderItemService.findAllOrderItems();
        if (orderItems.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<OrderItem>>(orderItems, HttpStatus.OK);
    }

/*  >>>>>>>>>>>>>>>>>>> 날짜, 시간 코드 작성(임시) <<<<<<<<<<<<<<<<<<<<<<<<<<<<
    @RequestMapping(value= "/list", method = RequestMethod.GET)
    public ResponseEntity getListAllByTime(@RequestParam("startDateTime") String startDateTime,
                                           @RequestParam("endDateTime") String endDateTime) throws Exception {


        List<OrderItem> orderItems = orderItemService.findAllOrderItems();
        TimeOrderItem timeOrderItem = new TimeOrderItem(startDateTime, endDateTime, orderItems);
        //List<TimeOrderItem> timeOrderItems  = new ArrayList<>();
        if (orderItems.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(timeOrderItem, HttpStatus.OK);

    }*/

    @RequestMapping(value= "/list/time", method = RequestMethod.GET)
    public ResponseEntity getListAllByTime(@RequestParam("startDateTime") String startDateTime,
                                           @RequestParam("endDateTime") String endDateTime) throws Exception {
        List<OrderItem> orderItems = orderItemService.findAllOrderItems();

        if (orderItems.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<OrderItem>>(orderItems, HttpStatus.OK);

    }

}
