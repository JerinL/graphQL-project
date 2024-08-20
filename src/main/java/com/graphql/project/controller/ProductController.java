package com.graphql.project.controller;

import com.graphql.project.entity.Product;
import com.graphql.project.service.ProductService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService ps;

    @QueryMapping
    public List<Product> getAllProduct(){
        return ps.getAllProduct();
    }

    @QueryMapping
    public List<Product> getProductById(@Argument String ){
        return ps.getAllProduct();
    }


}
