package org.hardwarestore.back.service;

import org.hardwarestore.back.dto.RequestProductDto;
import org.hardwarestore.back.dto.ResponseProductDto;
import org.hardwarestore.back.entity.Product;
import org.hardwarestore.back.repository.ProductRepository;

public class AddProductService {

    private ProductRepository productRepository;

    public AddProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ResponseProductDto addProduct(RequestProductDto request) {
        Product productForAdd = new Product(request.getName(),request.getPrice(),request.getManufacturer(),request.getCategory());
        Product productAfterAdd = productRepository.addProduct(productForAdd);
        return new ResponseProductDto(
                productAfterAdd.getIdForProduct(),
                productAfterAdd.getName(),
                productAfterAdd.getPrice(),
                productAfterAdd.getManufacturer(),
                productAfterAdd.getCategory()
        );
    }
}
