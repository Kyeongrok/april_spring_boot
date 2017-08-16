package com.aprilskin.entities;


import com.aprilskin.utils.LocalDateTimeAttributeConverter;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

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

    private int shopType;
    private String no;
    private String shipName;
    private String shipAddress;
    private String shipMobile;
    private String shipMessage;

    private long orderItemQty;
    private double amountPaid;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
    private List<OrderProduct> orderProducts;


    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime orderDatetime;



    public Order() {
    }

    public Order(String no, String shipName, String shipAddress, String shipMobile, String shipMessage, long orderItemQty, double amountPaid, List<OrderProduct> orderProducts, LocalDateTime orderDatetime) {
        this.no = no;
        this.shipName = shipName;
        this.shipAddress = shipAddress;
        this.shipMobile = shipMobile;
        this.shipMessage = shipMessage;
        this.orderItemQty = orderItemQty;
        this.amountPaid = amountPaid;
        this.orderProducts = orderProducts;
        this.orderDatetime = orderDatetime;
    }
}
