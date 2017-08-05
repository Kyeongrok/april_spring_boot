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
@Table(name="product")
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "code")
    private String code;

    @Column(name = "item_code")
    private String itemCode;

    @Column(name = "own_item_code")
    private String ownItemCode;

    @Column(name = "name")
    private String name;

    @Column(name = "quentity")
    private long quentity;

    @Column(name = "origin_cost")
    private long originCost;

    @Column(name = "price")
    private long price;

    @Column(name = "description")
    private String description;

    public Product() {
    }

    public Product(long id, String code, String itemCode, String ownItemCode, String name, long quentity, long originCost, long price, String description) {
        this.id = id;
        this.code = code;
        this.itemCode = itemCode;
        this.ownItemCode = ownItemCode;
        this.name = name;
        this.quentity = quentity;
        this.originCost = originCost;
        this.price = price;
        this.description = description;
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
