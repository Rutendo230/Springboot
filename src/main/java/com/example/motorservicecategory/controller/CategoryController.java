package com.example.motorservicecategory.controller;

import com.example.motorservicecategory.controller.dto.CreateCategoryRequest;
import com.example.motorservicecategory.controller.dto.CreateCategoryResponse;
import com.example.motorservicecategory.service.CategoryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/motor-service-categories")
public class CategoryController {

private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    private CreateCategoryResponse createCategory(@RequestBody CreateCategoryRequest createCategoryRequest) {
        return categoryService.create(createCategoryRequest);
    }
}
