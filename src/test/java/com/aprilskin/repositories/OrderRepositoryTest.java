package com.aprilskin.repositories;

import com.aprilskin.entities.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("local")
public class OrderRepositoryTest {

    @Autowired
    OrderRepository orderRepository;

    @Test
    public void findByOrderDatetimeBetween() throws Exception {
        String StartDateTime = "2017-08-09+00:00:00";
        String EndDateTime = "2017-08-09+22:00:00";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd+HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(StartDateTime, formatter);
        LocalDateTime dateTime2 = LocalDateTime.parse(EndDateTime, formatter);

        List<Order> orderList =orderRepository.findByOrderDatetimeBetween(dateTime, dateTime2);

        orderList.forEach(order ->{
            System.out.println(order.getNo());
        });

    }

}