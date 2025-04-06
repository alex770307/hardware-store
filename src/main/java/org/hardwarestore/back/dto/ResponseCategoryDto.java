package org.hardwarestore.back.dto;

public class ResponseCategoryDto {

    private Integer idFromCategory;

    private String name;

    private String description;

    public ResponseCategoryDto(Integer idFromCategory, String name, String description) {
        this.idFromCategory = idFromCategory;
        this.name = name;
        this.description = description;
    }

    public Integer getIdFromCategory() {
        return idFromCategory;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "ResponseCategoryDto{" +
                "idFromCategory=" + idFromCategory +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
