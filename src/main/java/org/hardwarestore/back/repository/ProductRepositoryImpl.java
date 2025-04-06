package org.hardwarestore.back.repository;

import org.hardwarestore.back.entity.Product;

import java.util.*;

public class ProductRepositoryImpl implements ProductRepository {

    private Map<Integer, Product> productsDatabase;
    private Integer productId;
    private final Integer startId = 0;

    public ProductRepositoryImpl() {
        this.productsDatabase = new HashMap<>();
        this.productId = startId;
    }

    @Override
    public Product addProduct(Product product) {
        productId++;
        Product newProduct = new Product(productId,
                product.getName(),
                product.getPrice(),
                product.getManufacturer(),
                product.getCategory());
        productsDatabase.put(productId, newProduct);
        return newProduct;
    }

    @Override
    public List<Product> findAllProducts() {
        return new ArrayList<>(productsDatabase.values());
    }

    @Override
    public Optional<Product> findProductById(Integer idFromProduct) {
        return Optional.ofNullable(productsDatabase.get(idFromProduct));
    }

    @Override
    public List<Product> findProductByName(String productName) {
        return productsDatabase.values().stream()
                .filter(product -> product.getName().equals(productName))
                .toList();
    }

    @Override
    public List<Product> findProductByManufacturer(String manufacturer) {
        return productsDatabase.values().stream()
                .filter(product -> product.getManufacturer().equals(manufacturer))
                .toList();
    }

    @Override
    public Optional<Product> deleteProductById(Integer idFromProduct) {
        return Optional.ofNullable(productsDatabase.remove(idFromProduct));
    }
}
