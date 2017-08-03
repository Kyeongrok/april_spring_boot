package com.aprilskin.getter;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.aprilskin.entities.Customer;
import com.aprilskin.entities.Product;
import com.aprilskin.service.OrderService;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.internal.parser.JSONParser;
import org.junit.Test;

import static org.junit.Assert.*;


public class UrlStringGetterTest {
    @Test
    public void name() throws Exception {
        UrlStringGetter urlStringGetter = new UrlStringGetter();
        String string = urlStringGetter.getString("https://datahub.cafe24.com/openapi/shop/order/v1/search?service_type=aprilskinkor&mall_id=onesper&data_type=json&auth_code=995ff59dd187520a69b3a89cc2e71e28");
        //System.out.println(string);
        ObjectMapper mapper = new ObjectMapper();
        Customer customer = mapper.readValue(string, Customer.class);
        System.out.println(customer);
    }
/*
    @Test
    public void save() throws Exception {
        Customer customer = new Customer();
    }
*/




}