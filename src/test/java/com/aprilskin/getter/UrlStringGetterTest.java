package com.aprilskin.getter;

import org.junit.Test;

import static org.junit.Assert.*;


public class UrlStringGetterTest {
    @Test
    public void name() throws Exception {
        UrlStringGetter urlStringGetter = new UrlStringGetter();
        String string = urlStringGetter.getString("https://datahub.cafe24.com/openapi/shop/order/v1/search?service_type=aprilskinkor&mall_id=onesper&data_type=json&auth_code=995ff59dd187520a69b3a89cc2e71e28");
        System.out.println(string);
    }

}