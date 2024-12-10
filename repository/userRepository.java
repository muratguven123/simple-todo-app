package com.todolist.todolist.repository;

import com.todolist.todolist.entity.users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<users,Integer> {

}
