package com.aprilskin.entities;


import lombok.Data;

import javax.persistence.*;

/**
 * Created by kyeongrok on 2017-08-01.
 */
@Entity
@Data
@Table(name="order_item")
public class OrderItem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String shop_no;
    private String shop_currency;
    private String order_no;
    private String market_order_no;
    private String order_datetime;
    private String pay_datetime;
    private String amount_paid;
    private String amount_product;
    private String amount_ship;
    private String rewardpoint_used;
    private String pay_method;
    private String pay_escrow_flag;
    private String account_bank;
    private String account_no;
    private String account_sender;
    private String ship_international;
    private String inflow_path_code;
    private String inflow_path_name;
    private String sale_market_code;
    private String sale_market_name;
    private String first_order_flag;
    private String bill_name;
    private String bill_email;
    private String bill_phone;
    private String bill_mobile;
    private String bill_member_id;
    private String bill_member_group_name;
    private String ship_name;
    private String ship_zipcode;
    private String ship_address1;
    private String ship_address2;
    private String ship_phone;
    private String ship_mobile;
    private String ship_phone_temp;
    private String ship_message;
    private String ship_name_english;
    private String ship_address1_english;
    private String ship_address2_english;
    private String ship_address3_english;
    private String ship_country_code;
    private String ship_country_name;
    private String ship_identity;
    private String name_phonetic;
    private String country_engname;
    private String hope_shipping_time;
    private String hope_shipping_company_id;
    private String is_deferred_payment;
    private String deferred_payment_commission;
    private String updatereceiver_datetime;
    private String member_group_price;
    private String name_first;
    private String name_last;
    private String name_phonetic_first;
    private String name_phonetic_last;
    private String receiver_name_en_first;
    private String receiver_name_en_last;
    private String desired_delivery_date;


    public OrderItem() {
    }


    public OrderItem(String shop_no, String shop_currency, String order_no, String market_order_no, String order_datetime, String pay_datetime, String amount_paid, String amount_product, String amount_ship, String rewardpoint_used, String pay_method, String pay_escrow_flag, String account_bank, String account_no, String account_sender, String ship_international, String inflow_path_code, String inflow_path_name, String sale_market_code, String sale_market_name, String first_order_flag, String bill_name, String bill_email, String bill_phone, String bill_mobile, String bill_member_id, String bill_member_group_name, String ship_name, String ship_zipcode, String ship_address1, String ship_address2, String ship_phone, String ship_mobile, String ship_phone_temp, String ship_message, String ship_name_english, String ship_address1_english, String ship_address2_english, String ship_address3_english, String ship_country_code, String ship_country_name, String ship_identity, String name_phonetic, String country_engname, String hope_shipping_time, String hope_shipping_company_id, String is_deferred_payment, String deferred_payment_commission, String updatereceiver_datetime, String member_group_price, String name_first, String name_last, String name_phonetic_first, String name_phonetic_last, String receiver_name_en_first, String receiver_name_en_last, String desired_delivery_date) {
        this.shop_no = shop_no;
        this.shop_currency = shop_currency;
        this.order_no = order_no;
        this.market_order_no = market_order_no;
        this.order_datetime = order_datetime;
        this.pay_datetime = pay_datetime;
        this.amount_paid = amount_paid;
        this.amount_product = amount_product;
        this.amount_ship = amount_ship;
        this.rewardpoint_used = rewardpoint_used;
        this.pay_method = pay_method;
        this.pay_escrow_flag = pay_escrow_flag;
        this.account_bank = account_bank;
        this.account_no = account_no;
        this.account_sender = account_sender;
        this.ship_international = ship_international;
        this.inflow_path_code = inflow_path_code;
        this.inflow_path_name = inflow_path_name;
        this.sale_market_code = sale_market_code;
        this.sale_market_name = sale_market_name;
        this.first_order_flag = first_order_flag;
        this.bill_name = bill_name;
        this.bill_email = bill_email;
        this.bill_phone = bill_phone;
        this.bill_mobile = bill_mobile;
        this.bill_member_id = bill_member_id;
        this.bill_member_group_name = bill_member_group_name;
        this.ship_name = ship_name;
        this.ship_zipcode = ship_zipcode;
        this.ship_address1 = ship_address1;
        this.ship_address2 = ship_address2;
        this.ship_phone = ship_phone;
        this.ship_mobile = ship_mobile;
        this.ship_phone_temp = ship_phone_temp;
        this.ship_message = ship_message;
        this.ship_name_english = ship_name_english;
        this.ship_address1_english = ship_address1_english;
        this.ship_address2_english = ship_address2_english;
        this.ship_address3_english = ship_address3_english;
        this.ship_country_code = ship_country_code;
        this.ship_country_name = ship_country_name;
        this.ship_identity = ship_identity;
        this.name_phonetic = name_phonetic;
        this.country_engname = country_engname;
        this.hope_shipping_time = hope_shipping_time;
        this.hope_shipping_company_id = hope_shipping_company_id;
        this.is_deferred_payment = is_deferred_payment;
        this.deferred_payment_commission = deferred_payment_commission;
        this.updatereceiver_datetime = updatereceiver_datetime;
        this.member_group_price = member_group_price;
        this.name_first = name_first;
        this.name_last = name_last;
        this.name_phonetic_first = name_phonetic_first;
        this.name_phonetic_last = name_phonetic_last;
        this.receiver_name_en_first = receiver_name_en_first;
        this.receiver_name_en_last = receiver_name_en_last;
        this.desired_delivery_date = desired_delivery_date;
    }
}
