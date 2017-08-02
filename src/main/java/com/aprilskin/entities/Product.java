package com.aprilskin.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by kyeongrok on 2017-08-01.
 */
@Entity
public class Product {
    @Id
    long id;
    long order_no;
    int StartDatetime;
    int EndDatetime;

    public Product() {
    }

    public Product(long id, long order_no) {
        this.id = id;
        this.order_no = order_no;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrder_no() {
        return order_no;
    }

    public void setOrder_no(long order_no) {
        this.order_no = order_no;
    }

    public int getStartDatetime() {
        return StartDatetime;
    }

    public void setStartDatetime(int startDatetime) {
        StartDatetime = startDatetime;
    }

    public int getEndDatetime() {
        return EndDatetime;
    }

    public void setEndDatetime(int endDatetime) {
        EndDatetime = endDatetime;
    }
}
