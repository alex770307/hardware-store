package org.hardwarestore.back.service;

import org.hardwarestore.back.dto.ResponseCategoryDto;
import org.hardwarestore.back.entity.Category;
import org.hardwarestore.back.repository.CategoryRepository;

import java.util.List;

public class FindCategoryService {

    private CategoryRepository categoryRepository;

    public FindCategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<ResponseCategoryDto> findAllCategory() {
        List<Category> allCategories = categoryRepository.findAllCategories();
        return allCategories.stream()
                .map(currentCategory ->
                        new ResponseCategoryDto(
                                currentCategory.getIdForCategory(),
                                currentCategory.getName(),
                                currentCategory.getDescription()
                        ))
                .toList();
    }
}
