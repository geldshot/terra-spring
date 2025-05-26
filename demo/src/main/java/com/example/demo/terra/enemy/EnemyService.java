package com.example.demo.terra.enemy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnemyService {
    
    @Autowired
    private EnemyRepository enemyRepository;

    public List<Enemy> getAllEnemies() {
        return enemyRepository.findAll();
    }

    public Enemy getEnemyById(Long id){
        return enemyRepository.findById(id).orElse(null);
    }

    public List<Enemy> getByName(String name) {
        return enemyRepository.findEnemyByNameContaining(name);
    }

    public List<Enemy> getByKeyName(String keyName){
        return enemyRepository.findEnemyByKeyNameContaining(keyName);
    }
}
