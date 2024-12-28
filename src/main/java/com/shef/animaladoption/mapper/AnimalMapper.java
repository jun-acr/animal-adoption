package com.shef.animaladoption.mapper;

import com.shef.animaladoption.entity.Animal;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AnimalMapper {

    @Select("select id, animalType,photo,address,adopted from animals where id = #{id}")
    public Animal getAnimalById(String id);

    @Select("select * from animals")
    public List<Animal> getAllAnimals();

    @Insert("insert into animals (id,animalType, photo, address,adopted) values (#{id}, #{animalType}, #{photo}, #{address},#{adopted})")
    public void addAnimal(Animal animal);

    @Update("UPDATE animals SET adopted = true WHERE id = #{id}")
    void adoptAnimalById(String id);

    @Delete("DELETE FROM animals WHERE id = #{id}")
    void deleteAnimalById(String id);
}
