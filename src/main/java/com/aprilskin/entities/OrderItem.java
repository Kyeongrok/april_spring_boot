package com.aprilskin.entities;


import com.aprilskin.utils.LocalDateTimeAttributeConverter;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by kyeongrok on 2017-08-01.
 */
@Entity
@Data
@Table(name="order_item")
public class OrderItem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String orderNo;
    private String shipName;
    private String shipAddress1;
    private String shipAddress2;
    private String shipMobile;
    private String shipMessage;
    private String productCode;
    private long orderItemQty;
    private String itemCode;


    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime orderDatetime;



    public OrderItem() {
    }

    public OrderItem(String orderNo, String shipName, String shipAddress1, String shipAddress2, String shipMobile, String shipMessage, String productCode, long orderItemQty, String itemCode) {
        this.orderNo = orderNo;
        this.shipName = shipName;
        this.shipAddress1 = shipAddress1;
        this.shipAddress2 = shipAddress2;
        this.shipMobile = shipMobile;
        this.shipMessage = shipMessage;
        this.productCode = productCode;
        this.orderItemQty = orderItemQty;
        this.itemCode = itemCode;
    }
}
