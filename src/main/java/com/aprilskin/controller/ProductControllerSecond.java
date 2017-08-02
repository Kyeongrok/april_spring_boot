package com.aprilskin.controller;

import com.aprilskin.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping({"https://datahub.cafe24.com/openapi/shop/order/v1/search?service_type=aprilskinkor&mall_id=onesper&data_type=json&auth_code=995ff59dd187520a69b3a89cc2e71e28"})
public class ProductControllerSecond {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value ="/{StartDatetime}/{EndDatetime}", method = {RequestMethod.GET, RequestMethod.OPTIONS})
    public ResponseEntity getProductPerTime(@PathVariable int StartDatetime,
                                             @PathVariable int EndDatetime) {
        return new ResponseEntity<>(orderService.getProductList(), HttpStatus.OK);
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.OPTIONS})
    public ResponseEntity getProductPerTimeSecond(@RequestParam("start_datetime") int StartDatetime, @RequestParam("end_datetime") int EndDatetime) {

        return new ResponseEntity<>(orderService.getProductList(), HttpStatus.OK);
    }


}
