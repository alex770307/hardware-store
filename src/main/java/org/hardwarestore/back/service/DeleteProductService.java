package org.hardwarestore.back.service;

import org.hardwarestore.back.entity.Product;
import org.hardwarestore.back.repository.ProductRepository;

import java.util.Optional;

public class DeleteProductService {

    private ProductRepository productRepository;

    public DeleteProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Optional<Product> deleteProduct(Integer idForProduct) {
        return productRepository.deleteProductById(idForProduct);
    }
}
