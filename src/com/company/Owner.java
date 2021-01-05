package com.company;

import java.util.List;

public class Owner {

    List<Animal> animals;

    public Owner(List<Animal> animals) {
        this.animals = animals;
    }

    public void feed() {
        animals.forEach(Animal::feed);
    }
}
