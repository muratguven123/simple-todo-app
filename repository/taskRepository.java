package com.todolist.todolist.repository;

import com.todolist.todolist.entity.task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface taskRepository extends JpaRepository<task, Integer> {

}