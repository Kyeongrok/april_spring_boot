package com.aprilskin.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.MetaValue;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by kyeongrok on 2017-08-01.
 */
@Entity
@Data
public class Product {

    @Id @GeneratedValue
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



}
