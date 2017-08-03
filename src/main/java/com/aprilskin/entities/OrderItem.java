package com.aprilskin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by kyeongrok on 2017-08-01.
 */
@Entity
public class OrderItem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String no;

    public OrderItem() {
    }

    public OrderItem(String no) {
        this.no = no;
    }
}
