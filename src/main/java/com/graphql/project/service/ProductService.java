package com.graphql.project.service;

import com.graphql.project.entity.Product;
import com.graphql.project.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProduct(){
       return productRepo.findAll();
    }

}
