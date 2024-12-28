package com.shef.animaladoption;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.shef.animaladoption.mapper")
public class AnimalAdoptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalAdoptionApplication.class, args);
	}

}
