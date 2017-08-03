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
            orderItemList.add(new OrderItem(result.get("shop_no").asText(),
                    result.get("shop_currency").asText(), result.get("order_no").asText(),
                    result.get("market_order_no").asText(), result.get("order_datetime").asText(),
                    result.get("pay_datetime").asText(), result.get("amount_paid").asText(),
                    result.get("amount_product").asText(), result.get("amount_ship").asText(),
                    result.get("rewardpoint_used").asText(), result.get("pay_method").asText(),
                    result.get("pay_escrow_flag").asText(), result.get("account_bank").asText(),
                    result.get("account_no").asText(), result.get("account_sender").asText(),
                    result.get("ship_international").asText(), result.get("inflow_path_code").asText(),
                    result.get("inflow_path_name").asText(), result.get("sale_market_code").asText(),
                    result.get("sale_market_name").asText(), result.get("first_order_flag").asText(),
                    result.get("bill_name").asText(), result.get("bill_email").asText(),
                    result.get("bill_phone").asText(), result.get("bill_mobile").asText(),
                    result.get("bill_member_id").asText(), result.get("bill_member_group_name").asText(),
                    result.get("ship_name").asText(), result.get("ship_zipcode").asText(),
                    result.get("ship_address1").asText(), result.get("ship_address2").asText(),
                    result.get("ship_phone").asText(), result.get("ship_mobile").asText(),
                    result.get("ship_phone_temp").asText(), result.get("ship_message").asText(),
                    result.get("ship_name_english").asText(), result.get("ship_address1_english").asText(),
                    result.get("ship_address2_english").asText(), result.get("ship_address3_english").asText(),
                    result.get("ship_country_code").asText(), result.get("ship_country_name").asText(),
                    result.get("ship_identity").asText(), result.get("name_phonetic").asText(),
                    result.get("country_engname").asText(), result.get("hope_shipping_time").asText(),
                    result.get("hope_shipping_company_id").asText(), result.get("is_deferred_payment").asText(),
                    result.get("deferred_payment_commission").asText(), result.get("updatereceiver_datetime").asText(),
                    result.get("member_group_price").asText(), result.get("name_first").asText(),
                    result.get("name_last").asText(), result.get("name_phonetic_first").asText(),
                    result.get("name_phonetic_last").asText(), result.get("receiver_name_en_first").asText(),
                    result.get("receiver_name_en_last").asText(), result.get("desired_delivery_date").asText()

            ));

        });


        return orderItemList;
    }

}
