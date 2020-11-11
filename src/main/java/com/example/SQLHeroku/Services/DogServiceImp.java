package com.example.SQLHeroku.Services;

import com.example.SQLHeroku.Models.Dog;
import com.example.SQLHeroku.REpos.DogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class DogServiceImp implements DogService {

    @Autowired
    DogRepo dogRepo;






    @Override
    public Dog getDogFromApi() {


        RestTemplate restTemplate= new RestTemplate();

        return restTemplate.getForObject("https://dog.ceo/api/breeds/image/random", Dog.class);
    }

    @Override
    public void postDog(Dog dog) {
        dogRepo.save(dog);

    }



    @Override
    public Iterable<Dog> getallDog() {
        return dogRepo.findAll();
    }
}
