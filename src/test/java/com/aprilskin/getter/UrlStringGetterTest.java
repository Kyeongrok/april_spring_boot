package com.aprilskin.getter;

import org.junit.Test;

import static org.junit.Assert.*;


public class UrlStringGetterTest {
    @Test
    public void name() throws Exception {
        UrlStringGetter urlStringGetter = new UrlStringGetter();
        String string = urlStringGetter.getString("www.google.com");
        System.out.println(string);
    }

}