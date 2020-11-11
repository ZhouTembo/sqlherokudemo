package com.example.SQLHeroku.REpos;

import com.example.SQLHeroku.Models.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DogRepo extends CrudRepository <Dog, Long> {
}
