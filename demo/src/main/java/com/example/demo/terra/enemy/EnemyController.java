package com.example.demo.terra.enemy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Enemy")
public class EnemyController {

    @Autowired
    private EnemyService enemyService;

    @GetMapping("/{enemyId}")
    public Enemy getEnemyById(@PathVariable Long enemyId){
        return enemyService.getEnemyById(enemyId);
    }

    @GetMapping("")
    public List<Enemy> getEnemies() {
        return enemyService.getAllEnemies();
    }
    

}
