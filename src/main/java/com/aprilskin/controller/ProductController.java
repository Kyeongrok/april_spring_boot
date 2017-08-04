package com.aprilskin.controller;


import com.aprilskin.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.ParseException;

@RestController
@RequestMapping({"/aprilskin/v1/order"})
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/list/", method = {RequestMethod.GET, RequestMethod.OPTIONS})
    public ResponseEntity getList(@PathVariable int startDatetime) throws Exception {
        return new ResponseEntity<>(orderService.getProductList(), HttpStatus.OK);
    }

//    @GetMapping
//    public ResponseEntity getSchedules() throws IOException, ParseException {
//        ResponseEntity<List<Game>> responseEntity = new ResponseEntity<>(baseballService.schedule(), HttpStatus.OK);
//        return responseEntity;
//    }

}
