package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Cat", true);
        Dog dog = new Dog("Dog", false);

        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);

	    Owner owner = new Owner(animals);
	    owner.feed();
    }
}
