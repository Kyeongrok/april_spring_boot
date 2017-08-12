package com.aprilskin.controller;


import com.aprilskin.dto.OrderDto;
import com.aprilskin.dto.OrderProductDto;
import com.aprilskin.entities.Order;
import com.aprilskin.entities.OrderProduct;
import com.aprilskin.entities.Product;
import com.aprilskin.repositories.OrderRepository;
import com.aprilskin.repositories.ProductRepository;
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

    @Autowired
    private ProductRepository productRepository;


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


        List<OrderProductDto> orderProductDtoList = new ArrayList<>();
        orders.forEach((order) -> {
            order.getOrderProducts().forEach(orderProduct -> {
                List<Product> products = productRepository.findByProductCodeAndItemCode(orderProduct.getProductCode(), orderProduct.getItemCode());
                if(products != null){
                    products.forEach(product -> {
                        OrderProductDto orderProductDto = new OrderProductDto();
                        orderProductDto.setNo(order.getNo());
                        orderProductDto.setShipName(order.getShipName());
                        orderProductDto.setShipAddress(order.getShipAddress());
                        orderProductDto.setShipMobile(order.getShipMobile());
                        orderProductDto.setShipMessage(order.getShipMessage());

                        String orderDateTime = order.getOrderDatetime().format(formatter2);
                        orderProductDto.setOrderDatetime(orderDateTime);

                        orderProductDto.setItemCode(orderProduct.getItemCode());
                        orderProductDto.setProductName(orderProduct.getProductName());
                        //orderProductDto.setOwnItemCode(orderProduct.getOwnItemCode());
                        orderProductDto.setOrderItemQty(orderProduct.getOrderItemQty());
                        orderProductDto.setProductCode(orderProduct.getProductCode());
                        orderProductDto.setPrice(orderProduct.getPrice());

                        orderProductDto.setOwnItemCode(product.getOwnItemCode());
                        orderProductDtoList.add(orderProductDto);
                    });
                }else{
                    OrderProductDto orderProductDto = new OrderProductDto();
                    orderProductDto.setNo(order.getNo());
                    orderProductDto.setShipName(order.getShipName());
                    orderProductDto.setShipAddress(order.getShipAddress());
                    orderProductDto.setShipMobile(order.getShipMobile());
                    orderProductDto.setShipMessage(order.getShipMessage());

                    orderProductDto.setItemCode(orderProduct.getItemCode());
                    orderProductDto.setProductName(orderProduct.getProductName());
                    //orderProductDto.setOwnItemCode(orderProduct.getOwnItemCode());
                    orderProductDto.setOrderItemQty(orderProduct.getOrderItemQty());
                    orderProductDto.setProductCode(orderProduct.getProductCode());
                    orderProductDtoList.add(orderProductDto);
                }

            });
        });


        OrderDto orderDto = new OrderDto();
        orderDto.setStartDatetime(startDateTime2);
        orderDto.setEndDatetime(endDateTime2);
        orderDto.setOrderProductDtoList(orderProductDtoList);

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
