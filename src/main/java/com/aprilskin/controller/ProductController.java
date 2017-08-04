package com.aprilskin.controller;


import com.aprilskin.entities.Product;
import com.aprilskin.repositories.ProductRepository;
import com.aprilskin.service.OrderService;
import com.aprilskin.service.ProductService;
import com.aprilskin.utils.CustomErrorType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.ParseException;

@RestController
@RequestMapping({"/aprilskin/v1/product"})
@CrossOrigin(origins = "*")
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(value = "/list", method = {RequestMethod.GET, RequestMethod.OPTIONS})
    public ResponseEntity getList(@RequestParam("startDatetime") String startDatetime) throws Exception {
        return new ResponseEntity<>(productService.getProductList(), HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.GET, RequestMethod.OPTIONS})
    public ResponseEntity deleteItem(@RequestParam("id") long id) throws Exception {
        productService.deleteItem(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateUser(@PathVariable("id") long id, @RequestBody Product product) {
        log.info("Updating User with id {}", id);

        Product currentProduct = productRepository.findOne(id);

        if (currentProduct == null) {
            log.error("Unable to update. User with id {} not found.", id);
            return new ResponseEntity(new CustomErrorType("Unable to upate. User with id " + id + " not found."),
                    HttpStatus.NOT_FOUND);
        }

        currentProduct.setName(product.getName());

        productRepository.save(currentProduct);
        return new ResponseEntity<Product>(currentProduct, HttpStatus.OK);
    }

//    @GetMapping
//    public ResponseEntity getSchedules() throws IOException, ParseException {
//        ResponseEntity<List<Game>> responseEntity = new ResponseEntity<>(baseballService.schedule(), HttpStatus.OK);
//        return responseEntity;
//    }

}
