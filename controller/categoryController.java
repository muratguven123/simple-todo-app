package com.todolist.todolist.controller;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.todolist.entity.category;
import com.todolist.todolist.repository.categoryRepository;
import com.todolist.todolist.service.categoryService;




@RequestMapping("/category")
@RestController
@Component
public class categoryController {

    private categoryService categoryService;
    private categoryRepository categoryRepository;

    public categoryController(categoryService categoryService){
        this.categoryService = categoryService;
    }
    @GetMapping
    public List <category> getcategory() {
       return categoryService.getAllCategory();
    }

    @GetMapping("/id")
    public Optional<category> getCategoryById(@RequestParam Integer id) {
        return categoryService.getCategoryById(id);
    }

    @PostMapping
    public category addCategory(@RequestBody category category) {    
        return categoryService.addCategory(category);
    }
    @PutMapping
    public category updateCategory(@PathVariable Integer id, @RequestBody category category) {
        
        return categoryService.updateCategory(id, category);
    }
    @DeleteMapping
    public void deleteCategory(Integer id){
        categoryService.deleteCategory(id);
    }
    
    






}
