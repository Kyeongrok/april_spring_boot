package com.aprilskin.controller;


import com.aprilskin.entities.OrderItem;
import com.aprilskin.repositories.OrderItemRepository;
import com.aprilskin.service.OrderItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/aprilskin/v1/order"})
@CrossOrigin(origins = "*")
@Slf4j
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @Autowired
    private OrderItemRepository orderItemRepository;

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
