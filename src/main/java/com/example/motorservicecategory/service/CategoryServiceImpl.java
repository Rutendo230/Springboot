package com.example.motorservicecategory.service;

import com.example.motorservicecategory.controller.dto.CategoryDto;
import com.example.motorservicecategory.controller.dto.CreateCategoryRequest;
import com.example.motorservicecategory.controller.dto.CreateCategoryResponse;
import com.example.motorservicecategory.models.Category;
import com.example.motorservicecategory.repo.CategoryRepository;

import java.util.Optional;

public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CreateCategoryResponse create(CreateCategoryRequest createCategoryRequest) {
        CreateCategoryResponse createCategoryResponse = new CreateCategoryResponse();
        //validation
        Optional<Category> fetchedCategory = categoryRepository.findByName(createCategoryRequest.getName());
        if (fetchedCategory.isPresent()) {
            createCategoryResponse.setMessage("Category already exists");
            return createCategoryResponse;
        }

        Category newCategory = new Category();
        newCategory.setName(createCategoryRequest.getName());
        newCategory.setDescription(createCategoryRequest.getDescription());
        Category savedCategory = categoryRepository.save(newCategory);

        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(savedCategory.getId());
        categoryDto.setName(savedCategory.getName());
        categoryDto.setDescription(savedCategory.getDescription());
        
        createCategoryResponse.setMessage("Category created successfully");
        createCategoryResponse.setCategoryDto(categoryDto);
        return createCategoryResponse;
    }
}
