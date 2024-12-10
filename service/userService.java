package com.todolist.todolist.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.todolist.todolist.entity.users;
import com.todolist.todolist.repository.userRepository;
@Service
public class userService {
    private userRepository userRepository;
    public userService(userRepository userRepository){
        this.userRepository = userRepository; 
    }
    
    public List<users> getUsers(userRepository user){
        return user.findAll();
    }
    public Optional<users> getUsersById(Integer id){
        return userRepository.findById(id);
    }
    public users newUser(users newUser){
        return (users) userRepository.save(newUser);
    }
    public users updaUser(Integer userid,users user){
        Optional<users> usersOptional = userRepository.findById(userid);
        if(usersOptional.isPresent()){
            users updatUsers = usersOptional.get();
            updatUsers.setEmail(user.getemail());
            updatUsers.setId(user.getId());
            updatUsers.setName(user.getname());
            updatUsers.setPassword(user.getPassword());
            return updatUsers;
        }else{
            return null;
        }      
    }
     public void deleteUser(Integer userid){
        userRepository.deleteById(userid);
    }


}
