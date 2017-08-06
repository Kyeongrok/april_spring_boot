package com.aprilskin.schedule;

import com.aprilskin.entities.OrderItem;
import com.aprilskin.getter.FileStringGetter;
import com.aprilskin.getter.UrlStringGetter;
import com.aprilskin.getter.list.OrderListGetter;
import com.aprilskin.repositories.OrderRepository;
import com.aprilskin.service.OrderItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by kyeongrok.kim on 2017-08-01.
 */
@Component
@Slf4j
public class Cafe24ApiCallScheduled {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemService orderItemService;

    private OrderListGetter orderListGetter = new OrderListGetter();

    //라이브 5분마다
    @Scheduled(fixedRate = 300000)
    public void livescore(){
        String string = new FileStringGetter().getString("./test_data/april_cafe24_api_result.json");
        List<OrderItem> orderItemList = orderListGetter.getOrderList(string);

        orderItemList.forEach((orderItem)->{
            orderItemService.saveOrderItem(orderItem);
        });

    }

}