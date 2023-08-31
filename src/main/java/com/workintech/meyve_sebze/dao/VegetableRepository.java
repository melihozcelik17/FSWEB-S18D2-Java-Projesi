package com.workintech.meyve_sebze.dao;

import com.workintech.meyve_sebze.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Fruit, Integer> {
    @Query("SELECT v FROM Vegetable v ORDER BY v.price desc")
    List<Fruit> getByPriceDesc();
    @Query("SELECT v FROM Vegetable v ORDER BY v.price asc")
    List<Fruit> getByPriceAsc();
    @Query("SELECT v FROM Vegetable v WHERE v.name ilike %:name%")
    List<Fruit> searchByName(String name);

}
