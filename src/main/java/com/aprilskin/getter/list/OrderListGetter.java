package com.aprilskin.getter.list;

import com.aprilskin.entities.OrderItem;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OrderListGetter {
    public List<OrderItem> getOrderList(String string){
        List<OrderItem> orderItemList = new ArrayList<>();

        JsonNode jsonNode;

        //json으로 변경함
        //error가 나면 null return
        ObjectMapper mapper = new ObjectMapper();
        try {
            jsonNode = mapper.readValue(string, JsonNode.class);
        } catch (IOException e) {
            return null;
        }

        JsonNode results = jsonNode.get("response").get("result");

        results.forEach((result)->{
            orderItemList.add(new OrderItem(result.get("order_no").asText()));
        });

        return orderItemList;
    }

}
