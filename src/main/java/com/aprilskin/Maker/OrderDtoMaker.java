package com.aprilskin.Maker;


import com.aprilskin.dto.OrderDto;
import com.aprilskin.dto.OrderProductDto;
import com.aprilskin.entities.Order;
import com.aprilskin.entities.Product;
import com.aprilskin.repositories.OrderRepository;
import com.aprilskin.repositories.ProductRepository;
import com.aprilskin.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Component
public class OrderDtoMaker {
    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;


    public OrderDto makeOrderDto(int shopType, String startDateTime, String endDateTime) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(startDateTime, formatter);
        LocalDateTime dateTime2 = LocalDateTime.parse(endDateTime, formatter);


        List<Order> orders = orderRepository.findByOrderDatetimeBetweenAndShopType(dateTime, dateTime2, shopType);


        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String startDateTime2 = dateTime.format(formatter2);
        String endDateTime2 = dateTime2.format(formatter2);


        List<OrderProductDto> orderProductDtoList = new ArrayList<>();
        orders.forEach((order) -> {
            order.getOrderProducts().forEach(orderProduct -> {
                List<Product> products = productRepository.findByProductCodeAndItemCode(orderProduct.getProductCode(), orderProduct.getItemCode());
                if(products != null && products.size() > 0){
                    products.forEach(product -> {
                        OrderProductDto orderProductDto = new OrderProductDto();
                        orderProductDto.setNo(order.getNo());
                        orderProductDto.setShipName(order.getShipName());
                        orderProductDto.setShipAddress(order.getShipAddress());
                        orderProductDto.setShipMobile(order.getShipMobile());
                        orderProductDto.setShipMessage(order.getShipMessage());
                        orderProductDto.setAmountPaid(order.getAmountPaid());


                        LocalDateTime orderDateTime = order.getOrderDatetime();
                        String orderDateTimeString = orderDateTime.format(formatter2);
                        orderProductDto.setOrderDatetime(orderDateTimeString);

                        orderProductDto.setItemCode(orderProduct.getItemCode());
                        orderProductDto.setProductName(orderProduct.getProductName());;
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
                    orderProductDto.setAmountPaid(order.getAmountPaid());

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

        return orderDto;

    }
}
