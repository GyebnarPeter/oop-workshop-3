package com.company;

public class Dog extends Animal {
    public Dog(String name, boolean isMale) {
        super(name, isMale);
    }

    @Override
    public void speak() {
        System.out.println("Wuff");
    }
}
