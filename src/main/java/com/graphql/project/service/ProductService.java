package com.graphql.project.service;

import com.graphql.project.entity.Product;
import com.graphql.project.exception.CustomException;
import com.graphql.project.funtionalInterface.ProductInterface;
import com.graphql.project.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProduct(){
       return productRepo.findAll();
    }

    public Product getProductById(Integer id){
        if(id==null)
            throw new CustomException("id can't be null");
        return productRepo.findById(String.valueOf(id)).orElseThrow(() -> new CustomException("Product with "+id+" not found"));
    }

    public List<Product> getProductByCategory(String category) {
        ProductInterface productInterface = (cat) -> productRepo.findByCategory(cat);
        return productInterface.findProduct(category);
    }

    public String updateProductStock(Integer id, int stock){
        Product product = productRepo.findById(String.valueOf(id)).orElseThrow(()-> new CustomException("product not found with this id"+id+""));
        product.setQuantity(product.getQuantity()+stock);
        product.setStock(stock);
        productRepo.save(product);
        return ("stock updated successfully");
    }

    public String createNewProduct(Integer id, int stock){
        Product product = productRepo.findById(String.valueOf(id)).orElseThrow(()-> new CustomException("product not found with this id"+id+""));
        product.setQuantity(product.getQuantity()+stock);
        product.setStock(stock);
        productRepo.save(product);
        return ("stock updated successfully");
    }


}
