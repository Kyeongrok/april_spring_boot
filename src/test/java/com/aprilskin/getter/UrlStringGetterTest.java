package com.aprilskin.getter;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.aprilskin.entities.Customer;
import com.aprilskin.entities.Product;
import com.aprilskin.service.OrderService;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.internal.parser.JSONParser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


public class UrlStringGetterTest {

    @Autowired
    UrlStringGetter urlStringGetter;

    @Test
    public void name() throws Exception {
        UrlStringGetter urlStringGetter = new UrlStringGetter();
        String string = urlStringGetter.getString("https://datahub.cafe24.com/openapi/shop/order/v1/search?service_type=aprilskinkor&mall_id=onesper&data_type=json&auth_code=995ff59dd187520a69b3a89cc2e71e28");
        System.out.println(string);
        ObjectMapper mapper = new ObjectMapper();
        Customer customer = mapper.readValue(string, Customer.class);
        //assertEquals("20170726-0008173", customer.getResponse().getResult().get(0).getOrder_no());

    }

}