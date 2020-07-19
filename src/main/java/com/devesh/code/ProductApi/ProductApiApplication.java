package com.devesh.code.ProductApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;

import javax.sql.DataSource;

@EnableSwagger2WebFlux
@SpringBootApplication
public class ProductApiApplication {



	public static void main(String[] args) {

		SpringApplication.run(ProductApiApplication.class, args);
	}

}
