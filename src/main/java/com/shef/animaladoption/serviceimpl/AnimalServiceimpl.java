package com.shef.animaladoption.serviceimpl;

import com.shef.animaladoption.entity.Animal;
import com.shef.animaladoption.mapper.AnimalMapper;
import com.shef.animaladoption.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalServiceimpl implements AnimalService {
    @Autowired
    private AnimalMapper animalMapper;

    @Override
    public Animal getAnimalById(String id) {
        return animalMapper.getAnimalById(id);

    }

    @Override
    public List<Animal> getAllAnimals() {
        return animalMapper.getAllAnimals();
    }

    @Override
    public void addAnimal(Animal animal) {
        animalMapper.addAnimal(animal);
    }

    @Override
    public Animal updateAnimal(Animal animal) {
        return null;
    }

    @Override
    public void deleteAnimalById(String id) {
        animalMapper.deleteAnimalById(id);
    }

    @Override
    public void adoptAnimalById(String id) {
        animalMapper.adoptAnimalById(id);
    }
}
