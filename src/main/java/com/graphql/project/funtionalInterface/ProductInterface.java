package com.graphql.project.funtionalInterface;

import com.graphql.project.entity.Product;

import java.util.List;

@FunctionalInterface
public interface ProductInterface {
    List<Product> findProduct(String category);
}
