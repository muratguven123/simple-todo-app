package com.todolist.todolist.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.todolist.todolist.entity.category;
import com.todolist.todolist.repository.categoryRepository;

@Service
public class categoryService {
    private categoryRepository categoryRepository;

    public categoryService(categoryRepository categoryRepository){

        this.categoryRepository = categoryRepository;
    }
    public List<category> getAllCategory(){
        return categoryRepository.findAll();
    }
    public Optional<category> getCategoryById(Integer id){
        return categoryRepository.findById(id);
    }
    public category addCategory(category category){
        return (com.todolist.todolist.entity.category) categoryRepository.save(category);
    }
    public category updateCategory(Integer id,category category){
        Optional<category> updateCategory = categoryRepository.findById(id);
        if(updateCategory.isPresent()){
            category.setId(category.getId());
            category.setName(category.getname());
            return category;
        }else return  null;
    }
    public void deleteCategory(Integer id){
        categoryRepository.deleteById(id);
    }


    

}
