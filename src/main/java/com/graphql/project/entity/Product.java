package com.graphql.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String category;
    private float prize;
    private int stock;
    private int quantity;
    private Date createdOn;
    private Date updatedOn;
    private String createdBy;
    private String updatedBy;

    public Product(Integer id, String name, String category, float prize, int stock,int quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.prize = prize;
        this.stock = stock;
        this.quantity= quantity;
    }
}
