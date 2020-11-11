package com.example.SQLHeroku.Controllers;


import com.example.SQLHeroku.Models.Dog;
import com.example.SQLHeroku.Services.DogServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DogController {

    @Autowired
    DogServiceImp dogServiceImp;


    @GetMapping("/dogs")
    public Iterable<Dog> getAllDogs(){
        return dogServiceImp.getallDog();
    }


    @PostMapping("/create/dog")
    public String postDog(){
        Dog dog = dogServiceImp.getDogFromApi();
        dogServiceImp.postDog(dog);
        return "Dog fetched";
    }
}
