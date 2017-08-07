package com.aprilskin.controller;


import com.aprilskin.dto.OrderDto;
import com.aprilskin.entities.Order;
import com.aprilskin.repositories.OrderRepository;
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
    private OrderRepository orderRepository;


    @RequestMapping(value= "/list", method = RequestMethod.GET)
    public ResponseEntity getListAllByTime(@RequestParam("startDateTime") String startDateTime,
                                           @RequestParam("endDateTime") String endDateTime) throws Exception {
        List<Order> orders = orderItemService.findAllOrderItems();

        if (orders.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }

        OrderDto orderDto = new OrderDto();
        orderDto.setStartDatetime(startDateTime);
        orderDto.setEndDatetime(endDateTime);
        orderDto.setOrderList(orders);


        return new ResponseEntity<OrderDto>(orderDto, HttpStatus.OK);

    }

}
