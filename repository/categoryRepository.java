package com.todolist.todolist.repository;


import com.todolist.todolist.entity.category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface categoryRepository extends JpaRepository<category, Integer> {

}
