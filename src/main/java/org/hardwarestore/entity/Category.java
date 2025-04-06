package org.hardwarestore.entity;

public class Category {

    private Long id;

    private String name;

    private String description;

    public Category(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Category(String description, String name) {
        this.description = description;
        this.name = name;
    }

    public Category() {
    }
}
