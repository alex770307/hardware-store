package org.hardwarestore.back.entity;

public class Category {

    private Integer idForCategory;

    private String name;

    private String description;

    public Category(Integer idForCategory, String name, String description) {
        this.idForCategory = idForCategory;
        this.name = name;
        this.description = description;
    }

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Category() {
    }

    public Integer getIdForCategory() {
        return idForCategory;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + idForCategory +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
