package org.hardwarestore.entity;

import java.math.BigDecimal;

public class Product {

    private Long id;

    private String name;

    private BigDecimal price;

    private String manufacturer;

    public Product(Long id, String name, BigDecimal price, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }
}
