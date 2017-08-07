package com.aprilskin.entities;


import com.aprilskin.utils.LocalDateTimeAttributeConverter;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by kyeongrok on 2017-08-01.
 */
@Entity
@Data
@Table(name="order1")
public class Order {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String no;
    private String shipName;
    private String shipAddress;
    private String shipMobile;
    private String shipMessage;
    private String productCode;
    private long orderItemQty;
    private String itemCode;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
    private List<OrderProduct> orderProducts;


    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime orderDatetime;



    public Order() {
    }

    public Order(String no, String shipName, String shipAddress, String shipMobile, String shipMessage, String productCode, long orderItemQty, String itemCode, List<OrderProduct> orderProducts, LocalDateTime orderDatetime) {
        this.no = no;
        this.shipName = shipName;
        this.shipAddress = shipAddress;
        this.shipMobile = shipMobile;
        this.shipMessage = shipMessage;
        this.productCode = productCode;
        this.orderItemQty = orderItemQty;
        this.itemCode = itemCode;
        this.orderProducts = orderProducts;
        this.orderDatetime = orderDatetime;
    }
}
