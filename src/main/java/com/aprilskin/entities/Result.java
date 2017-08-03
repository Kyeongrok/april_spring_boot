package com.aprilskin.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;


@Data
public class Result {
    public Result() {
    }


    String shop_no;
    String shop_currency;
    String order_no;
    String market_order_no;
    String order_datetime;
    String pay_datetime;
    String amount_paid;
    String amount_product;
    String amount_ship;
    String rewardpoint_used;
    String pay_method;
    String pay_escrow_flag;
    String account_bank;
    String account_no;
    String account_sender;
    String ship_international;
    String  inflow_path_code;
    String  inflow_path_name;
    String  sale_market_code;
    String  sale_market_name;
    String  first_order_flag;
    String bill_name;
    String bill_email;
    String bill_phone;
    String bill_mobile;
    String bill_member_id;
    String bill_member_group_name;
    String ship_name;
    String ship_zipcode;
    String ship_address1;
    String ship_address2;
    String ship_phone;
    String ship_mobile;
    String ship_phone_temp;
    String ship_message;
    String ship_name_english;
    String ship_address1_english;
    String ship_address2_english;
    String ship_address3_english;
    String ship_country_code;
    String ship_country_name;
    String ship_identity;
    String name_phonetic;
    String country_engname;
    String hope_shipping_time;
    String hope_shipping_company_id;
    String is_deferred_payment;
    String deferred_payment_commission;
    String updatereceiver_datetime;
    String member_group_price;
    String name_first;
    String name_last;
    String name_phonetic_first;
    String name_phonetic_last;
    String receiver_name_en_first;
    String receiver_name_en_last;
    String desired_delivery_date;

    List<Product> product;


}
