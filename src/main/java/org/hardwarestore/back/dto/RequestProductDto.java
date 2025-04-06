package org.hardwarestore.back.dto;

import org.hardwarestore.back.entity.Category;

import java.math.BigDecimal;

public class RequestProductDto {

    private String name;

    private Double price;

    private String manufacturer;

    private Category category;

    public RequestProductDto(String name, Double price, String manufacturer, Category category) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Category getCategory() {
        return category;
    }
}
