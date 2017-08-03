package com.aprilskin.controller;

import com.aprilskin.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping({"https://datahub.cafe24.com/openapi/shop/order/v1"})
public class ProductControllerSecond {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value ="/search", method = {RequestMethod.GET, RequestMethod.OPTIONS})
    public ResponseEntity getProductPerTime(@RequestParam String service_type, @RequestParam String id,
                                            @RequestParam String data_type, @RequestParam String auth_code,
                                            @RequestParam String startDatetime, @RequestParam String endDatetime) {
        return new ResponseEntity<>(orderService.getProductList(), HttpStatus.OK);
    }




}
