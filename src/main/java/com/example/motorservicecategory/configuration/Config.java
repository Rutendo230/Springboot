package com.example.motorservicecategory.configuration;

import com.example.motorservicecategory.repo.CategoryRepository;
import com.example.motorservicecategory.service.CategoryService;
import com.example.motorservicecategory.service.CategoryServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public CategoryService categoryService(CategoryRepository categoryRepository) {
        return new CategoryServiceImpl(categoryRepository);
    }
}
