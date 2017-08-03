package com.aprilskin.entities;

public class Response {

    String total_record;
    Result[] result;

    public String getTotal_record() {
        return total_record;
    }

    public void setTotal_record(String total_record) {
        this.total_record = total_record;
    }

    public Result[] getResult() {
        return result;
    }

    public void setResult(Result[] result) {
        this.result = result;
    }
}
