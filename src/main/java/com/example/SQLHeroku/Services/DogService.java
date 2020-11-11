package com.example.SQLHeroku.Services;

import com.example.SQLHeroku.Models.Dog;

public interface DogService {
    public Dog getDogFromApi();
    public void postDog(Dog dog);
    public Iterable<Dog> getallDog();
}
