package org.example;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String uniqueCharacteristic;

    public Animal(String name, int age, String uniqueCharacteristic) {
        this.name = name;
        this.age = age;
        this.uniqueCharacteristic = uniqueCharacteristic;
    }

    public Animal() {

    }

    public String getName() {
        return this.name;
    }

    public abstract void show();
}
