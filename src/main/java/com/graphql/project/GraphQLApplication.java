package com.graphql.project;

import com.graphql.project.entity.Product;
import com.graphql.project.repo.ProductRepo;
import com.graphql.project.service.ProductService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class GraphQLApplication {

	@Autowired
	private ProductRepo pr;

	@PostConstruct
	public void initDB(){
		List<Product> products = Stream.of(
				new Product(1, "Laptop", "Electronics", 50,100,100),
				new Product(2, "Smartphone", "Electronics", 60,7346,7346),
				new Product(3, "Office Chair", "Furniture", 60,100,100),
				new Product(4, "Notebook", "Stationery", 70,100,100),
				new Product(5, "Desk Lamp", "Furniture", 80,100,100),
				new Product(6, "Water Bottle", "Accessories", 30,100,100)
		).collect(Collectors.toList());
//		pr.saveAll(products);
	}

	public static void main(String[] args) {
		SpringApplication.run(GraphQLApplication.class, args);
	}

}
