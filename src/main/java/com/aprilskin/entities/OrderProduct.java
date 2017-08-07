package com.aprilskin.entities;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by DELL on 2017-08-07.
 */
@Entity
@Data
public class OrderProduct {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    //private long orderItemId;
    private String productCode;
    private int quentity;
    private String itemCode;


}
