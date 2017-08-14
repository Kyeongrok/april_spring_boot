package com.aprilskin.schedule;




//import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.TimeZone;

/**
 * Created by DELL on 2017-08-14.
 */
//@Slf4j
public class Cafe24ApiCallScheduled {
    @Test
    public void name() throws Exception {
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime after10Hour = dateTime.plusHours(10l);
        System.out.println(("date time : "+after10Hour.toString()));

        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));

        System.out.println(TimeZone.getDefault());
    }
}
