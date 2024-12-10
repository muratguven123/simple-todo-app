package com.todolist.todolist.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.todolist.todolist.entity.task;
import com.todolist.todolist.repository.taskRepository;

@Service
public class taskService {

    private taskRepository taskRepository;

    public taskService(taskRepository taskRepository){
        this.taskRepository = taskRepository;
    }
    public List<task> getTask(){
        return taskRepository.findAll();
    }
    public Optional<task> getTaskByid(Integer id){
        return taskRepository.findById(id);
    }
    public task addTask(task task){
        return (task)taskRepository.save(task);
    }
    public task updateTask(Integer id,task task){
        Optional<task> updateTask = taskRepository.findById(id);
        if(updateTask.isPresent()){
            task.setcategory(task.getcategory());
            task.setId(task.getid());
            task.setname(task.getname());
            return task;
        }else return null;
    }

    public void deletetask(Integer id){
        taskRepository.deleteById(id);
    }
}
