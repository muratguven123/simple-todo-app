package com.todolist.todolist.request;

import org.springframework.web.bind.annotation.RequestMapping;

import lombok.Data;

@RequestMapping
@Data
public class taskrequest {
    Integer id;
    String name;
    String category;

}
