package com.aprilskin.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.MetaValue;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by kyeongrok on 2017-08-01.
 */
@Entity
public class Product {

    @Id
    long id;


    public Product() {
    }



}
