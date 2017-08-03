package com.aprilskin.entities;

public class Meta {

    public Meta() {
    }
    int code;
    String message;
    String trace_id;
    String expiration_date;
    String auth_expiration_date;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTrace_id() {
        return trace_id;
    }

    public void setTrace_id(String trace_id) {
        this.trace_id = trace_id;
    }

    public String getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public String getAuth_expiration_date() {
        return auth_expiration_date;
    }

    public void setAuth_expiration_date(String auth_expiration_date) {
        this.auth_expiration_date = auth_expiration_date;
    }
}

