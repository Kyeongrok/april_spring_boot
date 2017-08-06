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
    private String shopNo;
    private String shopCurrency;
    private String orderNo;

    public OrderItem() {
    }

    public OrderItem(String shopNo, String shopCurrency, String orderNo) {
        this.shopNo = shopNo;
        this.shopCurrency = shopCurrency;
        this.orderNo = orderNo;
    }
}
