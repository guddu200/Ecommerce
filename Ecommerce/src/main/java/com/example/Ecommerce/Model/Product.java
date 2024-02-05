package com.example.Ecommerce.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name="ecommerce_product")

public class Product {
    @GeneratedValue
    @Id
    @Column(name="product_id")
    private int id;
    @Column(name = "product_price")
    private int price;
    @Column(name="product_name")
    private  String name;
    @Column(name = "product_description")
    private  String description;
    @Column(name = "product_category")
    private String category;
    @Column(name = "product_mfd")
    private Date mfd;
}
