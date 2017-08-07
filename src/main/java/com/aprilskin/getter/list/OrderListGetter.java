package com.aprilskin.getter.list;

import com.aprilskin.entities.OrderItem;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;

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
        JsonNode resultSecond = jsonNode.get("response").get("result").get("product");

        results.forEach((result)->{
            orderItemList.add(new OrderItem(result.get("order_no").asText(),
                    result.get("ship_name").asText(), result.get("ship_address1").asText(),
                    result.get("ship_address2").asText(), result.get("ship_mobile").asText(),
                    result.get("ship_message").asText(), resultSecond.get("product_code").asText(),
                    resultSecond.get("order_item_qty").asLong(), resultSecond.get("item_code").asText()
                    ));
        });


        return orderItemList;
    }

}
