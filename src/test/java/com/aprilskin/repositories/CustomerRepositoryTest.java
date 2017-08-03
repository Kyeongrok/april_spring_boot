package com.aprilskin.repositories;

import com.aprilskin.entities.Customer;
import com.aprilskin.entities.Result;
import com.aprilskin.getter.UrlStringGetter;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerRepositoryTest {

//    @Autowired
//    CustomerRepository customerRepository;

    @Test
    public void name2() throws Exception {
        UrlStringGetter urlStringGetter = new UrlStringGetter();
        String string = urlStringGetter.getString("https://datahub.cafe24.com/openapi/shop/order/v1/search?service_type=aprilskinkor&mall_id=onesper&data_type=json&auth_code=995ff59dd187520a69b3a89cc2e71e28");
        //System.out.println(string);
        ObjectMapper mapper = new ObjectMapper();
        Customer customer = mapper.readValue(string, Customer.class);
        //assertEquals("20170726-0008173", customer.getResponse().getResult().get(0).getOrder_no());



    }
/*
    @Test
    public void save() throws Exception {
        Result result = new Result();

    }
    */

}