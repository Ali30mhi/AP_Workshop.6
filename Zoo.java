package org.example;

import org.example.*;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private  List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAnimals() {
        for (Animal animal : animals) {
            animal.show();
        }
    }
}
