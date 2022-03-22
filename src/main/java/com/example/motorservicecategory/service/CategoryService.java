package com.example.motorservicecategory.service;

import com.example.motorservicecategory.controller.dto.CreateCategoryRequest;
import com.example.motorservicecategory.controller.dto.CreateCategoryResponse;

public interface CategoryService {
    CreateCategoryResponse create(CreateCategoryRequest createCategoryRequest);
}
