package com.example.demo.terra.enemy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Enemy")
public class EnemyController {

    @GetMapping("/{enemyId}")
    public Enemy getEnemyById(@PathVariable int enemyId){
        return new Enemy();
    }

    @GetMapping("")
    public List<Enemy> getEnemies() {
        List<Enemy> list = new ArrayList<>();
        for(int i = 0; i< 5; i++){
            list.add(new Enemy());
        }
        return list;
    }
    

}
