package org.hardwarestore.back.service;

import org.hardwarestore.back.entity.Category;
import org.hardwarestore.back.repository.CategoryRepository;

import java.util.Optional;

public class DeleteCategoryService {

    private CategoryRepository categoryRepository;

    public DeleteCategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Optional<Category> deleteCategory(Integer idForCategory) {
        return categoryRepository.deleteCategoryById(idForCategory);
    }
}
