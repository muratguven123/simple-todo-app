package com.todolist.todolist.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "task")
@Data

public class task {
    @Id
    Integer id;
    String name;
    String category;

    public Integer getid(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getcategory(){
        return category;
    }
    public void setcategory(String category){
        this.category = category;
    }
    
}
