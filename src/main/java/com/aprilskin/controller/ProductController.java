package com.aprilskin.controller;


import com.aprilskin.entities.Product;
import com.aprilskin.repositories.ProductRepository;
import com.aprilskin.service.ProductService;
import com.aprilskin.utils.CustomErrorType;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.HttpHead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import sun.misc.Request;

import java.util.List;

@RestController
@RequestMapping({"/aprilskin/v1/product"})
@CrossOrigin(origins = "*")
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductRepository productRepository;

    // >>>>>>>>>>>>>>>>>>>>>>   Create a Product  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    @RequestMapping(value= "/insert", method = RequestMethod.POST)
    public ResponseEntity<?> createProduct(@RequestParam("id") long id,@RequestParam("code") String code,
                                           @RequestParam("name") String name,@RequestParam("itemCode") String itemCode,
                                           @RequestParam("ownItemCode") String ownItemCode,@RequestParam("price") long price,
                                           @RequestParam("originCost") long originCost,@RequestParam("quentity") long quentity,
                                           @RequestParam("description") String description) {
        Product product = new Product(id, code, itemCode, ownItemCode, name, quentity, originCost, price, description);
        log.info("Creating Product : {}", product);
        if (productService.isProductExist(product)) {
            log.error("Unable to create. A Product name {} already exist", product.getName());
            return new ResponseEntity(new CustomErrorType("unable to create. A Product with name " +
                    product.getName() + " already exist."), HttpStatus.CONFLICT);
        }
        productService.saveProduct(product);

        //HttpHeaders headers = new HttpHeaders();


        return new ResponseEntity<Product>(product, HttpStatus.OK);
    }

    // >>>>>>>>>>>>>>>>>>>>>> Retrieve all Products  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity getListAll() throws Exception {
        List<Product> products = productService.findAllProducts();
        if (products.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }

/*
    // >>>>>>>>>>>>>>>>>>>>> Retrieve one Product <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    @RequestMapping(value ="/list/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getProduct(@PathVariable("id") long id) {
        Product product = productService.findById(id);
        if(product == null) {
            log.error("Product with id {} not found.", id);
            return new ResponseEntity(new CustomErrorType("Product with id" + product
            + "not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Product>(product, HttpStatus.OK);
    }
*/
    // >>>>>>>>>>>>>>>>>>>>>> Update a Product   <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<?> updateUser(@RequestParam("id") long id,@RequestParam("code") String code,
                                        @RequestParam("name") String name,@RequestParam("itemCode") String itemCode,
                                        @RequestParam("ownItemCode") String ownItemCode,@RequestParam("price") long price,
                                        @RequestParam("originCost") long originCost,@RequestParam("quentity") long quentity,
                                        @RequestParam("description") String description) {

        Product product = new Product(id, code, itemCode, ownItemCode, name, quentity, originCost, price, description);
        log.info("Updating User with id {}", id);

        Product currentProduct = productService.findById(id);

        if (currentProduct == null) {
            log.error("Unable to update. User with id {} not found.", id);
            return new ResponseEntity(new CustomErrorType("Unable to upate. User with id " + id + " not found."),
                    HttpStatus.NOT_FOUND);
        }

        currentProduct.setId(product.getId());
        currentProduct.setItemCode(product.getItemCode());
        currentProduct.setName(product.getName());
        currentProduct.setCode(product.getCode());
        currentProduct.setOwnItemCode(product.getOwnItemCode());
        currentProduct.setQuentity(product.getQuentity());
        currentProduct.setPrice(product.getPrice());
        currentProduct.setDescription(product.getDescription());
        currentProduct.setOriginCost(product.getOriginCost());

        productService.updateProduct(currentProduct);
        return new ResponseEntity<Product>(currentProduct, HttpStatus.OK);
    }

    // >>>>>>>>>>>>>>>>>>>>>>> Delete a Product <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteProduct(@RequestParam("id") long id) throws Exception {
        log.info("Fetching & Deleting Product with id {}", id);

        Product product = productService.findById(id);
        if( product == null) {
            log.error("Unable to delete. Product with id {} not found.", id);
            return new ResponseEntity(new CustomErrorType("Unable to delete. Product with" + id +
                    "not found."), HttpStatus.NOT_FOUND);
        }
        productService.deleteProductById(id);
        return new ResponseEntity<Product> (HttpStatus.NO_CONTENT);
    }
/*
    // >>>>>>>>>>>>>>>>>>>>>> Delete all Products <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public ResponseEntity<Product> deleteALLProducts() {
        log.info("Deleting All Products");

        productService.deleteAllProducts();
        return new ResponseEntity<Product>(HttpStatus.NO_CONTENT);
    }
*/
//    @GetMapping
//    public ResponseEntity getSchedules() throws IOException, ParseException {
//        ResponseEntity<List<Game>> responseEntity = new ResponseEntity<>(baseballService.schedule(), HttpStatus.OK);
//        return responseEntity;
//    }

}
