package com.aprilskin.schedule;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.time.LocalDateTime;

/**
 * Created by DELL on 2017-08-14.
 */
@Slf4j
public class Cafe24ApiCallScheduled {
    @Test
    public void name() throws Exception {
        LocalDateTime dateTime = LocalDateTime.now();
        log.info("date time : "+dateTime.toString());
    }
}
