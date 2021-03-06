package com.aprilskin.schedule;

import com.aprilskin.entities.Order;
import com.aprilskin.getter.UrlStringGetter;
import com.aprilskin.getter.list.OrderListGetter;
import com.aprilskin.repositories.OrderRepository;
import com.aprilskin.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
    private OrderService orderService;

    private OrderListGetter orderListGetter = new OrderListGetter();

    //라이브 5분마다
    @Scheduled(fixedRate = 1000 * 60 * 5)
    public void cafe24OrderListCall(){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd+HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.now();

        log.info("datetime : "+dateTime);

        //5분마다 6분 주기로 가지고 온다.
        String startDatetime = dateTime.minusMinutes(6).format(formatter);
        String endDatetime = dateTime.format(formatter);

        log.info(startDatetime + ", " + endDatetime);

        String aprilSkinString = new UrlStringGetter().getString("https://datahub.cafe24.com/openapi/shop/order/v1/search?service_type=aprilskinkor&mall_id=onesper&start_datetime="+startDatetime+"&end_datetime="+endDatetime+"&limit=2000&data_type=json&auth_code=995ff59dd187520a69b3a89cc2e71e28");
        String mediCubeString = new UrlStringGetter().getString("https://datahub.cafe24.com/openapi/shop/order/v1/search?service_type=medicube&mall_id=medicube0&start_datetime="+startDatetime+"&end_datetime="+endDatetime+"&limit=2000&data_type=json&auth_code=b5b4c56e7eb95ecaa87259dfaefd21b8");


        try {
            List<Order> aprilSkinOrderList = orderListGetter.getOrderList(aprilSkinString, 1);
            List<Order> mediCubeOrderList = orderListGetter.getOrderList(mediCubeString, 2);
            log.info("extracted orderList number:" + aprilSkinOrderList.size());
            orderRepository.save(aprilSkinOrderList);
            orderRepository.save(mediCubeOrderList);
        } catch (Exception e) {
            log.error("cafe24 processing error:", e);
        }

    }



}