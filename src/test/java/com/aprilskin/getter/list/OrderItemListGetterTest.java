package com.aprilskin.getter.list;

import com.aprilskin.entities.OrderItem;
import com.aprilskin.getter.FileStringGetter;
import com.aprilskin.repositories.OrderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("local")
public class OrderItemListGetterTest {
    @Autowired
    private OrderRepository orderRepository;

    private OrderListGetter orderListGetter = new OrderListGetter();

    @Test
    public void name() throws Exception {
        String string = new FileStringGetter().getString("./test_data/april_cafe24_api_result.json");
        List<OrderItem> orderItemList = orderListGetter.getOrderList(string);

        orderItemList.forEach((orderItem)->{
            orderRepository.save(orderItem);
        });


    }
}