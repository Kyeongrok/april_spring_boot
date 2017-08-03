package com.aprilskin.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.MetaValue;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by kyeongrok on 2017-08-01.
 */
@Entity
public class Product {
    String order_item_no;
    String order_item_no_set;
    String order_item_no_sys;
    String order_item_no_sys_prev;
    String place_datetime;
    String cancelrequest_datetime;
    String exchangerequest_datetime;
    String returnrequest_datetime;
    String cancel_datetime;
    String cancelcomplete_datetime;
    String exchangecomplete_datetime;
    String returncomplete_datetime;
    String shipstart_datetime;
    String shipend_datetime;
    String shipper_code;
    String invoice_no;
    String ship_no;
    String product_name;
    String product_name_english;
    String item_name;
    String item_entry;
    String product_code;
    String product_no;
    String item_code;
    String supplier_code;
    String supplier_name;
    String order_item_qty;
    String product_sale_price;
    String item_price_add;
    String product_sale_price_discount;
    String order_status;
    String product_name_default;
    String item_name_default;
    String store_pickup_flag;
    String setproduct_flag;
    String setproduct_code;
    String product_material_english;
    String cloth_material;
    String category_no_international;
    String hope_shipping_company_name;
    String category_no_international_info;
    String product_weight;
    String hscode;
    String volume_size_serial;
    String product_material;
    String product_material_eng;
    String cloth_fabric;
    String origin_place;

    public String getOrder_item_no() {
        return order_item_no;
    }

    public void setOrder_item_no(String order_item_no) {
        this.order_item_no = order_item_no;
    }

    public String getOrder_item_no_set() {
        return order_item_no_set;
    }

    public void setOrder_item_no_set(String order_item_no_set) {
        this.order_item_no_set = order_item_no_set;
    }

    public String getOrder_item_no_sys() {
        return order_item_no_sys;
    }

    public void setOrder_item_no_sys(String order_item_no_sys) {
        this.order_item_no_sys = order_item_no_sys;
    }

    public String getOrder_item_no_sys_prev() {
        return order_item_no_sys_prev;
    }

    public void setOrder_item_no_sys_prev(String order_item_no_sys_prev) {
        this.order_item_no_sys_prev = order_item_no_sys_prev;
    }

    public String getPlace_datetime() {
        return place_datetime;
    }

    public void setPlace_datetime(String place_datetime) {
        this.place_datetime = place_datetime;
    }

    public String getCancelrequest_datetime() {
        return cancelrequest_datetime;
    }

    public void setCancelrequest_datetime(String cancelrequest_datetime) {
        this.cancelrequest_datetime = cancelrequest_datetime;
    }

    public String getExchangerequest_datetime() {
        return exchangerequest_datetime;
    }

    public void setExchangerequest_datetime(String exchangerequest_datetime) {
        this.exchangerequest_datetime = exchangerequest_datetime;
    }

    public String getReturnrequest_datetime() {
        return returnrequest_datetime;
    }

    public void setReturnrequest_datetime(String returnrequest_datetime) {
        this.returnrequest_datetime = returnrequest_datetime;
    }

    public String getCancel_datetime() {
        return cancel_datetime;
    }

    public void setCancel_datetime(String cancel_datetime) {
        this.cancel_datetime = cancel_datetime;
    }

    public String getCancelcomplete_datetime() {
        return cancelcomplete_datetime;
    }

    public void setCancelcomplete_datetime(String cancelcomplete_datetime) {
        this.cancelcomplete_datetime = cancelcomplete_datetime;
    }

    public String getExchangecomplete_datetime() {
        return exchangecomplete_datetime;
    }

    public void setExchangecomplete_datetime(String exchangecomplete_datetime) {
        this.exchangecomplete_datetime = exchangecomplete_datetime;
    }

    public String getReturncomplete_datetime() {
        return returncomplete_datetime;
    }

    public void setReturncomplete_datetime(String returncomplete_datetime) {
        this.returncomplete_datetime = returncomplete_datetime;
    }

    public String getShipstart_datetime() {
        return shipstart_datetime;
    }

    public void setShipstart_datetime(String shipstart_datetime) {
        this.shipstart_datetime = shipstart_datetime;
    }

    public String getShipend_datetime() {
        return shipend_datetime;
    }

    public void setShipend_datetime(String shipend_datetime) {
        this.shipend_datetime = shipend_datetime;
    }

    public String getShipper_code() {
        return shipper_code;
    }

    public void setShipper_code(String shipper_code) {
        this.shipper_code = shipper_code;
    }

    public String getInvoice_no() {
        return invoice_no;
    }

    public void setInvoice_no(String invoice_no) {
        this.invoice_no = invoice_no;
    }

    public String getShip_no() {
        return ship_no;
    }

    public void setShip_no(String ship_no) {
        this.ship_no = ship_no;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_name_english() {
        return product_name_english;
    }

    public void setProduct_name_english(String product_name_english) {
        this.product_name_english = product_name_english;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_entry() {
        return item_entry;
    }

    public void setItem_entry(String item_entry) {
        this.item_entry = item_entry;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getProduct_no() {
        return product_no;
    }

    public void setProduct_no(String product_no) {
        this.product_no = product_no;
    }

    public String getItem_code() {
        return item_code;
    }

    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    public String getSupplier_code() {
        return supplier_code;
    }

    public void setSupplier_code(String supplier_code) {
        this.supplier_code = supplier_code;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public String getOrder_item_qty() {
        return order_item_qty;
    }

    public void setOrder_item_qty(String order_item_qty) {
        this.order_item_qty = order_item_qty;
    }

    public String getProduct_sale_price() {
        return product_sale_price;
    }

    public void setProduct_sale_price(String product_sale_price) {
        this.product_sale_price = product_sale_price;
    }

    public String getItem_price_add() {
        return item_price_add;
    }

    public void setItem_price_add(String item_price_add) {
        this.item_price_add = item_price_add;
    }

    public String getProduct_sale_price_discount() {
        return product_sale_price_discount;
    }

    public void setProduct_sale_price_discount(String product_sale_price_discount) {
        this.product_sale_price_discount = product_sale_price_discount;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public String getProduct_name_default() {
        return product_name_default;
    }

    public void setProduct_name_default(String product_name_default) {
        this.product_name_default = product_name_default;
    }

    public String getItem_name_default() {
        return item_name_default;
    }

    public void setItem_name_default(String item_name_default) {
        this.item_name_default = item_name_default;
    }

    public String getStore_pickup_flag() {
        return store_pickup_flag;
    }

    public void setStore_pickup_flag(String store_pickup_flag) {
        this.store_pickup_flag = store_pickup_flag;
    }

    public String getSetproduct_flag() {
        return setproduct_flag;
    }

    public void setSetproduct_flag(String setproduct_flag) {
        this.setproduct_flag = setproduct_flag;
    }

    public String getSetproduct_code() {
        return setproduct_code;
    }

    public void setSetproduct_code(String setproduct_code) {
        this.setproduct_code = setproduct_code;
    }

    public String getProduct_material_english() {
        return product_material_english;
    }

    public void setProduct_material_english(String product_material_english) {
        this.product_material_english = product_material_english;
    }

    public String getCloth_material() {
        return cloth_material;
    }

    public void setCloth_material(String cloth_material) {
        this.cloth_material = cloth_material;
    }

    public String getCategory_no_international() {
        return category_no_international;
    }

    public void setCategory_no_international(String category_no_international) {
        this.category_no_international = category_no_international;
    }

    public String getHope_shipping_company_name() {
        return hope_shipping_company_name;
    }

    public void setHope_shipping_company_name(String hope_shipping_company_name) {
        this.hope_shipping_company_name = hope_shipping_company_name;
    }

    public String getCategory_no_international_info() {
        return category_no_international_info;
    }

    public void setCategory_no_international_info(String category_no_international_info) {
        this.category_no_international_info = category_no_international_info;
    }

    public String getProduct_weight() {
        return product_weight;
    }

    public void setProduct_weight(String product_weight) {
        this.product_weight = product_weight;
    }

    public String getHscode() {
        return hscode;
    }

    public void setHscode(String hscode) {
        this.hscode = hscode;
    }

    public String getVolume_size_serial() {
        return volume_size_serial;
    }

    public void setVolume_size_serial(String volume_size_serial) {
        this.volume_size_serial = volume_size_serial;
    }

    public String getProduct_material() {
        return product_material;
    }

    public void setProduct_material(String product_material) {
        this.product_material = product_material;
    }

    public String getProduct_material_eng() {
        return product_material_eng;
    }

    public void setProduct_material_eng(String product_material_eng) {
        this.product_material_eng = product_material_eng;
    }

    public String getCloth_fabric() {
        return cloth_fabric;
    }

    public void setCloth_fabric(String cloth_fabric) {
        this.cloth_fabric = cloth_fabric;
    }

    public String getOrigin_place() {
        return origin_place;
    }

    public void setOrigin_place(String origin_place) {
        this.origin_place = origin_place;
    }
}
