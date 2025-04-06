package org.hardwarestore.back.dto;

public class RequestCategoryDto {

    private String name;

    private String description;

    public RequestCategoryDto(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
