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

    private String itemCode;
    private String ownItemCode;
    private String productName;
    private long orderItemQty;
    private String productCode;



    public Product() {
    }

    public Product(long id, String itemCode, String ownItemCode, String productName, long orderItemQty, String productCode) {
        this.id = id;
        this.itemCode = itemCode;
        this.ownItemCode = ownItemCode;
        this.productName = productName;
        this.orderItemQty = orderItemQty;
        this.productCode = productCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getOrderItemQty() {
        return orderItemQty;
    }

    public void setOrderItemQty(long orderItemQty) {
        this.orderItemQty = orderItemQty;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
