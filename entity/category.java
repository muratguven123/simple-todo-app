package com.todolist.todolist.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="category")
@Data
public class category {
 
    @Id
    Integer id;

    String name;
      

    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    public String getname(){

        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}
