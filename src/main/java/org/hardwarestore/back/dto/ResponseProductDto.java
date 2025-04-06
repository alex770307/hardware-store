package org.hardwarestore.back.dto;

import org.hardwarestore.back.entity.Category;

import java.math.BigDecimal;

public class ResponseProductDto {

    private Integer idFromProduct;

    private String name;

    private Double price;

    private String manufacturer;

    private Category category;

    public ResponseProductDto(Integer idFromProduct, String name, Double price,
                              String manufacturer, Category category) {
        this.idFromProduct = idFromProduct;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.category = category;
    }

    public Integer getIdFromProduct() {
        return idFromProduct;
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

    @Override
    public String toString() {
        return "ResponseProductDto{" +
                "idFromProduct=" + idFromProduct +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", category=" + category +
                '}';
    }
}
