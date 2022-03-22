package com.example.motorservicecategory.controller.dto;

public class CreateCategoryResponse {
    private String message;
    private CategoryDto categoryDto;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CategoryDto getCategoryDto() {
        return categoryDto;
    }

    public void setCategoryDto(CategoryDto categoryDto) {
        this.categoryDto = categoryDto;
    }

    @Override
    public String toString() {
        return "CreateCategoryResponse{" +
                "message='" + message + '\'' +
                ", categoryDto=" + categoryDto +
                '}';
    }
}
