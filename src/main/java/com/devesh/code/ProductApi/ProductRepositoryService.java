package com.devesh.code.ProductApi;

import com.devesh.code.ProductApi.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductRepositoryService {

    @Autowired
    DataSource dataSource;

    @Autowired
    ProductRepository productRepository;

    public List getAllProduct(){

        List<Product> productList=new ArrayList<>();
        productRepository.findAll().forEach(productList::add);
        return productList;
    }
}
