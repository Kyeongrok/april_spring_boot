package com.aprilskin.controller;


import com.aprilskin.dto.OrderDto;
import com.aprilskin.dto.OrderProductDto;
import com.aprilskin.entities.Order;
import com.aprilskin.entities.OrderProduct;
import com.aprilskin.entities.Product;
import com.aprilskin.repositories.OrderRepository;
import com.aprilskin.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping({"/aprilskin/v1/order"})
@CrossOrigin(origins = "*")
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderRepository orderRepository;


    @RequestMapping(value= "/list", method = RequestMethod.GET)
    public ResponseEntity getListAllByTime(@RequestParam("startDateTime") String startDateTime,
                                           @RequestParam("endDateTime") String endDateTime) throws Exception {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(startDateTime, formatter);
        LocalDateTime dateTime2 = LocalDateTime.parse(endDateTime, formatter);


        List<Order> orders = orderRepository.findByOrderDatetimeBetween(dateTime, dateTime2);


        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String startDateTime2 = dateTime.format(formatter2);
        String endDateTime2 = dateTime2.format(formatter2);


        /*List<OrderProductDto> orderProductDtos = new ArrayList<>();
        orders.forEach((order) -> {
            OrderProductDto orderProductDto = new OrderProductDto();
            orderProductDto.setNo(order.getNo());
        });*/


        OrderDto orderDto = new OrderDto();
        orderDto.setStartDatetime(startDateTime2);
        orderDto.setEndDatetime(endDateTime2);
        orderDto.setOrderList(orders);
        //orderDto.setOrderProductDtoList(orderProductDtos);


        return new ResponseEntity<OrderDto>(orderDto, HttpStatus.OK);

    }

    @RequestMapping(value = "/list/all", method = RequestMethod.GET)
    public ResponseEntity getListAll() throws Exception {
        List<Order> orders = orderService.findAllOrder();
        if (orders.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Order>>(orders, HttpStatus.OK);
    }

}
