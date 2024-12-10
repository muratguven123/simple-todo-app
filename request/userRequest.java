package com.todolist.todolist.request;

import org.springframework.web.bind.annotation.RequestMapping;

import lombok.Data;


@Data
@RequestMapping

public class userRequest {


    Integer id;

    String name;
    String email;
    Integer password;

}
