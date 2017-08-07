package com.aprilskin.schedule;

import com.aprilskin.entities.OrderItem;
import com.aprilskin.getter.UrlStringGetter;
import com.aprilskin.getter.list.OrderListGetter;
import com.aprilskin.repositories.OrderItemRepository;
import com.aprilskin.service.OrderItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by kyeongrok.kim on 2017-08-01.
 */
@Component
@Slf4j
public class Cafe24ApiCallScheduled {

    @Autowired
    private OrderItemRepository orderItemRepository;



    @Autowired
    private OrderItemService orderItemService;

    private OrderListGetter orderListGetter = new OrderListGetter();

    //라이브 5분마다
    @Scheduled(fixedRate = 1000 * 60 * 5)
    public void livescore(){

        LocalDateTime localDateTime = LocalDateTime.now();

        String startDatetime = "2017-08-06+11:00:00";
        String endDatetime = "2017-08-07+23:00:00";

        String string = new UrlStringGetter().getString("https://datahub.cafe24.com/openapi/shop/order/v1/search?service_type=aprilskinkor&mall_id=onesper&start_datetime="+startDatetime+"&end_datetime="+endDatetime+"&limit=2000&data_type=json&auth_code=995ff59dd187520a69b3a89cc2e71e28");
        List<OrderItem> orderItemList = orderListGetter.getOrderList(string);

        orderItemRepository.save(orderItemList);

    }

}