package com.aprilskin.getter.list;

import com.aprilskin.entities.Order;
import com.aprilskin.entities.OrderProduct;
import com.aprilskin.entities.Product;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;


public class OrderListGetter {
    public List<Order> getOrderList(String string){
        List<Order> orderList = new ArrayList<>();

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
            JsonNode orderProducts = result.get("product");

            Order order = new Order();
            order.setNo(result.get("order_no").asText());
            order.setShipAddress(result.get("ship_address1").asText() + " " + result.get("ship_address2").asText());
            order.setShipName(result.get("ship_name").asText());
            order.setShipMobile(result.get("ship_mobile").asText());
            order.setShipMessage(result.get("ship_message").asText());
            String dataString = result.get("order_datetime").asText();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime dateTime = LocalDateTime.parse(dataString,formatter);

            order.setOrderDatetime(dateTime);


            List<OrderProduct> orderProductList = new ArrayList<>();
            for(JsonNode product : orderProducts){

                OrderProduct orderProduct = new OrderProduct();
                orderProduct.setOrder(order);
                orderProduct.setProductCode(product.get("product_code").asText());
                orderProduct.setOrderItemQty(product.get("order_item_qty").asLong());
                orderProduct.setItemCode(product.get("item_code").asText());
                orderProduct.setProductName(product.get("product_name").asText());
                orderProduct.setPrice(product.get("product_sale_price").asDouble());

                order.setProductCode(product.get("product_code").asText());
                order.setOrderItemQty(product.get("order_item_qty").asLong());
                order.setItemCode(product.get("item_code").asText());

                orderProductList.add(orderProduct);
            }



            order.setOrderProducts(orderProductList);
            orderList.add(order);
        });


        return orderList;
    }

}
