package com.aprilskin.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.MetaValue;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by kyeongrok on 2017-08-01.
 */
@Entity
@Data
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String code;
    private String itemCode;
    private String ownItemCode;
    private String name;
    private long quentity;
    private long originCost;
    private long price;
    private String description;

    public Product() {
    }
/*
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getOwnItemCode() {
        return ownItemCode;
    }

    public void setOwnItemCode(String ownItemCode) {
        this.ownItemCode = ownItemCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getQuentity() {
        return quentity;
    }

    public void setQuentity(long quentity) {
        this.quentity = quentity;
    }

    public long getOriginCost() {
        return originCost;
    }

    public void setOriginCost(long originCost) {
        this.originCost = originCost;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    */
}
