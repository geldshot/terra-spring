package com.example.demo.terra.enemy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EnemyRepository extends JpaRepository<Enemy, Long>{
    List<Enemy> findEnemyByNameContaining(String name);
}
