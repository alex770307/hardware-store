package org.hardwarestore.back.service;

import org.hardwarestore.back.dto.RequestCategoryDto;
import org.hardwarestore.back.dto.ResponseCategoryDto;
import org.hardwarestore.back.entity.Category;
import org.hardwarestore.back.repository.CategoryRepository;

public class AddCategoryService {

    private CategoryRepository categoryRepository;

    public AddCategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public ResponseCategoryDto addCategory(RequestCategoryDto request) {
        Category categoryForAdd = new Category(request.getName(), request.getDescription());
        Category categoryAfterAdd = categoryRepository.addCategory(categoryForAdd);

        return new ResponseCategoryDto(
                categoryAfterAdd.getIdForCategory(),
                categoryAfterAdd.getName(),
                categoryAfterAdd.getDescription());
    }
}
