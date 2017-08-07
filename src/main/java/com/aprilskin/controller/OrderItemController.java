package com.aprilskin.controller;


import com.aprilskin.dto.OrderDto;
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


    @RequestMapping(value= "/list", method = RequestMethod.GET)
    public ResponseEntity getListAllByTime(@RequestParam("startDateTime") String startDateTime,
                                           @RequestParam("endDateTime") String endDateTime) throws Exception {
        List<OrderItem> orderItems = orderItemService.findAllOrderItems();

        if (orderItems.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }

        OrderDto orderDto = new OrderDto();
        orderDto.setStartDatetime(startDateTime);
        orderDto.setEndDatetime(endDateTime);
        orderDto.setOrderItemList(orderItems);


        return new ResponseEntity<OrderDto>(orderDto, HttpStatus.OK);

    }

}
