package com.example.demo.terra.enemy;

import lombok.Getter;
import lombok.Setter;

public class Enemy {

    @Getter @Setter private int id;
    @Getter @Setter private String name;
    
    public Enemy(){
        this.id = 0;
        this.name = "hello";
    }
}
