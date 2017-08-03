package com.aprilskin.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="customers")
public class Result {
    public Result() {
    }

    public Result(String shop_no, String shop_currency, String order_no, String market_order_no, String order_datetime, String pay_datetime, String amount_paid, String amount_product, String amount_ship, String rewardpoint_used, String pay_method, String pay_escrow_flag, String account_bank, String account_no, String account_sender, String ship_international, String inflow_path_code, String inflow_path_name, String sale_market_code, String sale_market_name, String first_order_flag, String bill_name, String bill_email, String bill_phone, String bill_mobile, String bill_member_id, String bill_member_group_name, String ship_name, String ship_zipcode, String ship_address1, String ship_address2, String ship_phone, String ship_mobile, String ship_phone_temp, String ship_message, String ship_name_english, String ship_address1_english, String ship_address2_english, String ship_address3_english, String ship_country_code, String ship_country_name, String ship_identity, String name_phonetic, String country_engname, String hope_shipping_time, String hope_shipping_company_id, String is_deferred_payment, String deferred_payment_commission, String updatereceiver_datetime, String member_group_price, String name_first, String name_last, String name_phonetic_first, String name_phonetic_last, String receiver_name_en_first, String receiver_name_en_last, String desired_delivery_date, List<Product> product) {
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
        this.product = product;
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


    public String getShop_no() {
        return shop_no;
    }

    public void setShop_no(String shop_no) {
        this.shop_no = shop_no;
    }

    public String getShop_currency() {
        return shop_currency;
    }

    public void setShop_currency(String shop_currency) {
        this.shop_currency = shop_currency;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public String getMarket_order_no() {
        return market_order_no;
    }

    public void setMarket_order_no(String market_order_no) {
        this.market_order_no = market_order_no;
    }

    public String getOrder_datetime() {
        return order_datetime;
    }

    public void setOrder_datetime(String order_datetime) {
        this.order_datetime = order_datetime;
    }

    public String getPay_datetime() {
        return pay_datetime;
    }

    public void setPay_datetime(String pay_datetime) {
        this.pay_datetime = pay_datetime;
    }

    public String getAmount_paid() {
        return amount_paid;
    }

    public void setAmount_paid(String amount_paid) {
        this.amount_paid = amount_paid;
    }

    public String getAmount_product() {
        return amount_product;
    }

    public void setAmount_product(String amount_product) {
        this.amount_product = amount_product;
    }

    public String getAmount_ship() {
        return amount_ship;
    }

    public void setAmount_ship(String amount_ship) {
        this.amount_ship = amount_ship;
    }

    public String getRewardpoint_used() {
        return rewardpoint_used;
    }

    public void setRewardpoint_used(String rewardpoint_used) {
        this.rewardpoint_used = rewardpoint_used;
    }

    public String getPay_method() {
        return pay_method;
    }

    public void setPay_method(String pay_method) {
        this.pay_method = pay_method;
    }

    public String getPay_escrow_flag() {
        return pay_escrow_flag;
    }

    public void setPay_escrow_flag(String pay_escrow_flag) {
        this.pay_escrow_flag = pay_escrow_flag;
    }

    public String getAccount_bank() {
        return account_bank;
    }

    public void setAccount_bank(String account_bank) {
        this.account_bank = account_bank;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

    public String getAccount_sender() {
        return account_sender;
    }

    public void setAccount_sender(String account_sender) {
        this.account_sender = account_sender;
    }

    public String getShip_international() {
        return ship_international;
    }

    public void setShip_international(String ship_international) {
        this.ship_international = ship_international;
    }

    public String getInflow_path_code() {
        return inflow_path_code;
    }

    public void setInflow_path_code(String inflow_path_code) {
        this.inflow_path_code = inflow_path_code;
    }

    public String getInflow_path_name() {
        return inflow_path_name;
    }

    public void setInflow_path_name(String inflow_path_name) {
        this.inflow_path_name = inflow_path_name;
    }

    public String getSale_market_code() {
        return sale_market_code;
    }

    public void setSale_market_code(String sale_market_code) {
        this.sale_market_code = sale_market_code;
    }

    public String getSale_market_name() {
        return sale_market_name;
    }

    public void setSale_market_name(String sale_market_name) {
        this.sale_market_name = sale_market_name;
    }

    public String getFirst_order_flag() {
        return first_order_flag;
    }

    public void setFirst_order_flag(String first_order_flag) {
        this.first_order_flag = first_order_flag;
    }

    public String getBill_name() {
        return bill_name;
    }

    public void setBill_name(String bill_name) {
        this.bill_name = bill_name;
    }

    public String getBill_email() {
        return bill_email;
    }

    public void setBill_email(String bill_email) {
        this.bill_email = bill_email;
    }

    public String getBill_phone() {
        return bill_phone;
    }

    public void setBill_phone(String bill_phone) {
        this.bill_phone = bill_phone;
    }

    public String getBill_mobile() {
        return bill_mobile;
    }

    public void setBill_mobile(String bill_mobile) {
        this.bill_mobile = bill_mobile;
    }

    public String getBill_member_id() {
        return bill_member_id;
    }

    public void setBill_member_id(String bill_member_id) {
        this.bill_member_id = bill_member_id;
    }

    public String getBill_member_group_name() {
        return bill_member_group_name;
    }

    public void setBill_member_group_name(String bill_member_group_name) {
        this.bill_member_group_name = bill_member_group_name;
    }

    public String getShip_name() {
        return ship_name;
    }

    public void setShip_name(String ship_name) {
        this.ship_name = ship_name;
    }

    public String getShip_zipcode() {
        return ship_zipcode;
    }

    public void setShip_zipcode(String ship_zipcode) {
        this.ship_zipcode = ship_zipcode;
    }

    public String getShip_address1() {
        return ship_address1;
    }

    public void setShip_address1(String ship_address1) {
        this.ship_address1 = ship_address1;
    }

    public String getShip_address2() {
        return ship_address2;
    }

    public void setShip_address2(String ship_address2) {
        this.ship_address2 = ship_address2;
    }

    public String getShip_phone() {
        return ship_phone;
    }

    public void setShip_phone(String ship_phone) {
        this.ship_phone = ship_phone;
    }

    public String getShip_mobile() {
        return ship_mobile;
    }

    public void setShip_mobile(String ship_mobile) {
        this.ship_mobile = ship_mobile;
    }

    public String getShip_phone_temp() {
        return ship_phone_temp;
    }

    public void setShip_phone_temp(String ship_phone_temp) {
        this.ship_phone_temp = ship_phone_temp;
    }

    public String getShip_message() {
        return ship_message;
    }

    public void setShip_message(String ship_message) {
        this.ship_message = ship_message;
    }

    public String getShip_name_english() {
        return ship_name_english;
    }

    public void setShip_name_english(String ship_name_english) {
        this.ship_name_english = ship_name_english;
    }

    public String getShip_address1_english() {
        return ship_address1_english;
    }

    public void setShip_address1_english(String ship_address1_english) {
        this.ship_address1_english = ship_address1_english;
    }

    public String getShip_address2_english() {
        return ship_address2_english;
    }

    public void setShip_address2_english(String ship_address2_english) {
        this.ship_address2_english = ship_address2_english;
    }

    public String getShip_address3_english() {
        return ship_address3_english;
    }

    public void setShip_address3_english(String ship_address3_english) {
        this.ship_address3_english = ship_address3_english;
    }

    public String getShip_country_code() {
        return ship_country_code;
    }

    public void setShip_country_code(String ship_country_code) {
        this.ship_country_code = ship_country_code;
    }

    public String getShip_country_name() {
        return ship_country_name;
    }

    public void setShip_country_name(String ship_country_name) {
        this.ship_country_name = ship_country_name;
    }

    public String getShip_identity() {
        return ship_identity;
    }

    public void setShip_identity(String ship_identity) {
        this.ship_identity = ship_identity;
    }

    public String getName_phonetic() {
        return name_phonetic;
    }

    public void setName_phonetic(String name_phonetic) {
        this.name_phonetic = name_phonetic;
    }

    public String getCountry_engname() {
        return country_engname;
    }

    public void setCountry_engname(String country_engname) {
        this.country_engname = country_engname;
    }

    public String getHope_shipping_time() {
        return hope_shipping_time;
    }

    public void setHope_shipping_time(String hope_shipping_time) {
        this.hope_shipping_time = hope_shipping_time;
    }

    public String getHope_shipping_company_id() {
        return hope_shipping_company_id;
    }

    public void setHope_shipping_company_id(String hope_shipping_company_id) {
        this.hope_shipping_company_id = hope_shipping_company_id;
    }

    public String getIs_deferred_payment() {
        return is_deferred_payment;
    }

    public void setIs_deferred_payment(String is_deferred_payment) {
        this.is_deferred_payment = is_deferred_payment;
    }

    public String getDeferred_payment_commission() {
        return deferred_payment_commission;
    }

    public void setDeferred_payment_commission(String deferred_payment_commission) {
        this.deferred_payment_commission = deferred_payment_commission;
    }

    public String getUpdatereceiver_datetime() {
        return updatereceiver_datetime;
    }

    public void setUpdatereceiver_datetime(String updatereceiver_datetime) {
        this.updatereceiver_datetime = updatereceiver_datetime;
    }

    public String getMember_group_price() {
        return member_group_price;
    }

    public void setMember_group_price(String member_group_price) {
        this.member_group_price = member_group_price;
    }

    public String getName_first() {
        return name_first;
    }

    public void setName_first(String name_first) {
        this.name_first = name_first;
    }

    public String getName_last() {
        return name_last;
    }

    public void setName_last(String name_last) {
        this.name_last = name_last;
    }

    public String getName_phonetic_first() {
        return name_phonetic_first;
    }

    public void setName_phonetic_first(String name_phonetic_first) {
        this.name_phonetic_first = name_phonetic_first;
    }

    public String getName_phonetic_last() {
        return name_phonetic_last;
    }

    public void setName_phonetic_last(String name_phonetic_last) {
        this.name_phonetic_last = name_phonetic_last;
    }

    public String getReceiver_name_en_first() {
        return receiver_name_en_first;
    }

    public void setReceiver_name_en_first(String receiver_name_en_first) {
        this.receiver_name_en_first = receiver_name_en_first;
    }

    public String getReceiver_name_en_last() {
        return receiver_name_en_last;
    }

    public void setReceiver_name_en_last(String receiver_name_en_last) {
        this.receiver_name_en_last = receiver_name_en_last;
    }

    public String getDesired_delivery_date() {
        return desired_delivery_date;
    }

    public void setDesired_delivery_date(String desired_delivery_date) {
        this.desired_delivery_date = desired_delivery_date;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
