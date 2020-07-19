package com.devesh.code.ProductApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class ProductAPIController {

    @Autowired
    ProductRepositoryService productRepositoryService;

    @RequestMapping(value="/getAllProduct",method = RequestMethod.GET)
    public List getAllProduct(){
        return productRepositoryService.getAllProduct();
    }
}
