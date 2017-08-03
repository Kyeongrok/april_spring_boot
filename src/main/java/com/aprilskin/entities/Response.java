package com.aprilskin.entities;

import javax.persistence.Entity;
import java.util.List;

//@Entity
public class Response {

    String total_record;
    List<Result> result;

    public Response() {
    }

    public Response(String total_record, List<Result> result) {
        this.total_record = total_record;
        this.result = result;
    }

    public String getTotal_record() {
        return total_record;
    }

    public void setTotal_record(String total_record) {
        this.total_record = total_record;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }
}
