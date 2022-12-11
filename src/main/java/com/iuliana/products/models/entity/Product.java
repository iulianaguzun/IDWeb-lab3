package com.iuliana.products.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id;

    @Column(name = "product_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "manufacture_id", referencedColumnName = "manufacture_id")
    private Manufacture manufacture;

    @ManyToOne
    @JoinColumn(name = "type_id", referencedColumnName = "type_id")
    private Type type;

    @Column(name = "product_price")
    private double price;
}
