package com.codejava.entities;

import javax.persistence.*;

@Entity
@Table(name = "product_details")
public class ProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45, nullable = false)
    private String name;

    @Column(length = 45, nullable = false)
    private String value;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public ProductDetails(Integer id, String name, String value, Product product) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.product = product;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return name + "=" + value;
    }

    public ProductDetails() {
    }

    public ProductDetails(String name, String value, Product product) {
        this.name = name;
        this.value = value;
        this.product = product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
