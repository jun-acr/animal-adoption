package com.shef.animaladoption.controller;

import com.shef.animaladoption.entity.Animal;
import com.shef.animaladoption.serviceimpl.AnimalServiceimpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
public class AnimalController {

    @Autowired
    private AnimalServiceimpl animalService;

    @GetMapping ("/getbyid/{id}")
    public Animal getById(@PathVariable String id) {
        log.info(id);
        return animalService.getAnimalById(id);
    }

    @PostMapping("/create")
    public void createAnimal(@RequestBody Animal animal) {
        log.info("Creating new animal: " + animal);
        animalService.addAnimal(animal);
    }

    @PutMapping("/update/{id}")
    public Animal updateAnimal(@PathVariable String id, @RequestBody Animal animal) {
        log.info("Updating animal with ID: " + id);
        animal.setId(id); // Assuming the ID is part of the Animal object
        return animalService.updateAnimal(animal);
    }

    @PostMapping("/delete/{id}")
    public void deleteAnimalById(@PathVariable String id) {
        log.info("Deleting animal with ID: " + id);
        animalService.deleteAnimalById(id);
    }
    @PostMapping("/adopt/{id}")
    public void adoptAnimal(@PathVariable String id) {
        log.info("Adopting animal with ID: " + id);
        animalService.adoptAnimalById(id);
    }

    @GetMapping("/getall")
    public List<Animal> getAllAnimals() {
        log.info("Fetching all animals");
        return animalService.getAllAnimals();
    }
}
