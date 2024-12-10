package com.todolist.todolist.controller;

import java.util.List;
import java.util.Optional;

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

import com.todolist.todolist.entity.task;
import com.todolist.todolist.repository.taskRepository;
import com.todolist.todolist.service.taskService;




@RequestMapping("/taskcontroller")
@RestController
@Component
public class taskController {

    private taskService taskService;
    private taskRepository taskRepository;
    public taskController(taskService taskService){
        this.taskService = taskService;
    }
    @GetMapping
    public List<task> getAllTask() {
        return taskService.getTask();
    }
    @GetMapping("/{id}")
    public Optional<task> getTaskByİd(@RequestParam Integer id) {
        return taskService.getTaskByid(id);
    }
    @PostMapping
    public task geTask(@RequestBody task task) {    
        return taskService.addTask(task);
    }
    @PutMapping
    public task updateTask(@PathVariable Integer id, @RequestBody task task) {    
        return taskService.updateTask(id, task);
    }
    @DeleteMapping
    public void deletetask(Integer id){
        taskService.deletetask(id);
    }
    
    















}
