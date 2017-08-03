package com.aprilskin.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
public class Customer {

    Meta meta;
    Response response;

    public Customer() {
    }

    public Customer(Meta meta, Response response) {
        this.meta = meta;
        this.response = response;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}
