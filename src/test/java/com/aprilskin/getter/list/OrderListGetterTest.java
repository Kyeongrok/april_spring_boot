package com.aprilskin.getter.list;

import com.aprilskin.entities.Order;
import com.aprilskin.getter.FileStringGetter;
import com.aprilskin.repositories.OrderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("local")
public class OrderListGetterTest {
    @Qualifier("orderRepository")
    @Autowired
    private OrderRepository orderRepository;

    private OrderListGetter orderListGetter = new OrderListGetter();

    @Test
    public void name() throws Exception {
        String string = new FileStringGetter().getString("./test_data/april_cafe24_api_result.json");
        List<Order> orderList = orderListGetter.getOrderList(string);

        orderList.forEach((orderItem)->{
            orderRepository.save(orderItem);
        });

        //orderRepository.save(orderList.get(0));


    }
}