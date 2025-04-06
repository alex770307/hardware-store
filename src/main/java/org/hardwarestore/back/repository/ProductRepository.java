package org.hardwarestore.back.repository;

import org.hardwarestore.back.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    Product addProduct(Product product);

    List<Product> findAllProducts();

    Optional<Product> findProductById(Integer id);

    List<Product> findProductByName(String productName);

    List<Product> findProductByManufacturer(String manufacturer);

    Optional<Product> deleteProductById(Integer id);
}
