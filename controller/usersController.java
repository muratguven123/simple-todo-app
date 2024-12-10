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

import com.todolist.todolist.entity.users;
import com.todolist.todolist.repository.userRepository;
import com.todolist.todolist.service.userService;


@RequestMapping("/users")
@RestController
@Component
public class usersController {
    private userService userService;
    private userRepository userRepository;

    public usersController(userService userService){
        this.userService = userService;
    }
//Crud Operations

    @GetMapping
    public List<users> getUsers(@RequestParam userRepository uRepository) {
        return userService.getUsers(uRepository);
    }
    @GetMapping("/{id}")
    public Optional<users> getusersbyid(@RequestParam Integer id) {
        return userService.getUsersById(id);
    }
    
    @PostMapping
    public users createusers(@RequestBody users newUsers) {
        return userService.newUser(newUsers);
    }
    @PutMapping
    public users updateusers(@PathVariable Integer id, @RequestBody users users) {        
        return userService.updaUser(id, users);
    }
    @DeleteMapping
    public void deleteusers(Integer id){
        userService.deleteUser(id);
    }
}
    
    



