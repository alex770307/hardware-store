package org.hardwarestore.back.entity;

public class Product {

    private Integer idForProduct;

    private String name;

    private Double price;

    private String manufacturer;

    private Category category;

    public Product(Integer idForProduct, String name, Double price, String manufacturer, Category category) {
        this.idForProduct = idForProduct;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.category = category;
    }

    public Product(String name, Double price, String manufacturer, Category category) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.category = category;
    }

    public Product() {
    }

    public Integer getIdForProduct() {
        return idForProduct;
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
        return "Product{" +
                "idForProduct=" + idForProduct +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", category=" + category +
                '}';
    }
}
