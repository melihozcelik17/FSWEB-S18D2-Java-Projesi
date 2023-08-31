package com.workintech.meyve_sebze.services;

import com.workintech.meyve_sebze.dao.FruitRepository;
import com.workintech.meyve_sebze.entity.Fruit;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class FruitServiceImpl implements FruitService {
    private FruitRepository fruitRepository;


    @Autowired
    public FruitServiceImpl(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }
    @Override
    public List<Fruit> findAll() {
        return fruitRepository.findAll();
    }

    @Override
    public List<Fruit> findAllByPriceDesc() {
        return fruitRepository.getByPriceDesc();
    }

    @Override
    public List<Fruit> findAllByPriceAsc() {
        return fruitRepository.getByPriceAsc();
    }

    @Override
    public List<Fruit> searchByName(String name) {
        return fruitRepository.searchByName(name);
    }


    @Override
    public Fruit find(int id) {
        Optional<Fruit> fruitOptional=fruitRepository.findById(id);

        return fruitOptional.get();
    }

    @Override
    public Fruit save(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public void delete(Fruit fruit) {
        fruitRepository.delete(fruit);

    }
}
