package com.devesh.code.ProductApi;

import com.devesh.code.ProductApi.Model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository  extends CrudRepository<Product,Integer> {


}
