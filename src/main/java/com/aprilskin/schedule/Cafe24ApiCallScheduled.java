package com.aprilskin.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by kyeongrok.kim on 2017-08-01.
 */
@Component
@Slf4j
public class Cafe24ApiCallScheduled {

    //라이브 1초마다
    @Scheduled(fixedRate = 1000)
    public void livescore(){
//        log.info("hello");
    }

}