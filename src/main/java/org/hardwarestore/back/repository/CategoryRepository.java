package org.hardwarestore.back.repository;

import org.hardwarestore.back.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository {


    Category addCategory(Category category);
    List<Category> findAllCategories();
    Optional<Category> findCategoryById(Integer id);
    List<Category> findCategoryByName(String categoryName);
    Optional<Category> deleteCategoryById(Integer id);
}
