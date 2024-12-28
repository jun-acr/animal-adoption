package com.shef.animaladoption.service;


import com.shef.animaladoption.entity.Animal;

import java.util.List;

public interface AnimalService {
    public Animal getAnimalById(String id);

    void addAnimal(Animal animal);

    Animal updateAnimal(Animal animal);

    void deleteAnimalById(String id);

    List<Animal> getAllAnimals();

    void adoptAnimalById(String id);
}
