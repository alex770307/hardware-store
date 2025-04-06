package org.hardwarestore.back.repository;

import org.hardwarestore.back.entity.Category;

import java.util.*;

public class CategoryRepositoryImpl implements CategoryRepository{

    private Map<Integer, Category> categoryDatabase;
    private Integer categoryId;
    private final Integer startId = 0;

    public CategoryRepositoryImpl() {
        this.categoryDatabase = new HashMap<>();
        this.categoryId = startId;
    }

    @Override
    public Category addCategory(Category category) {
        categoryId++;
        Category newCategory = new Category(categoryId,
                category.getName(),
                category.getDescription());
        categoryDatabase.put(categoryId, newCategory);
        return newCategory;
    }

    @Override
    public List<Category> findAllCategories() {
        return new ArrayList<>(categoryDatabase.values());
    }

    @Override
    public Optional<Category> findCategoryById(Integer idFromCategory) {
        return Optional.ofNullable(categoryDatabase.get(idFromCategory));
    }

    @Override
    public List<Category> findCategoryByName(String categoryName) {
        return categoryDatabase.values().stream()
                .filter(category -> category.getName().equals(categoryName))
                .toList();
    }

    @Override
    public Optional<Category> deleteCategoryById(Integer idFromCategory) {
        return Optional.ofNullable(categoryDatabase.remove(idFromCategory));
    }
}
