package org.hardwarestore.back.service;

import org.hardwarestore.back.dto.ResponseProductDto;
import org.hardwarestore.back.entity.Product;
import org.hardwarestore.back.repository.ProductRepository;

import java.util.List;

public class FindProductService {

    private ProductRepository productRepository;

    public FindProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ResponseProductDto> findAllProduct() {
        List<Product> allProducts = productRepository.findAllProducts();

        return allProducts.stream()
                .map(currentProduct ->
                        new ResponseProductDto(
                                currentProduct.getIdForProduct(),
                                currentProduct.getName(),
                                currentProduct.getPrice(),
                                currentProduct.getManufacturer(),
                                currentProduct.getCategory()
                        ))
                .toList();
    }
}
