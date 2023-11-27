package org.example;//package org.example;
//
//import org.example.*;
//
//public class Main {
//    public static <Cheetah> void main(String[] args) {
//        Zoo zoo = new Zoo();
//
//        Sparrow sparrow = new Sparrow("Sparrow", 3, 100);
//        Eagle eagle = new Eagle("Eagle", 5, 200);
//        Parrot parrot = new Parrot("Tiger", 7, 60.5);
//        Cheetah cheetah = new Cheetah("Cheetah", 4, 50.3);
//
//        // Add animals to the zoo
//        zoo.addAnimal(sparrow);
//        zoo.addAnimal(eagle);
//        zoo.addAnimal(Parrot);
//        zoo.addAnimal((Animal) cheetah);
//
//        // Show animals in the zoo
//        zoo.showAnimals();
//
//        // Show hunting
//        eagle.hunt(sparrow);
//        Parrot.hunt((Prey) cheetah);
//    }
//}


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals =new ArrayList<>();
        Eagle eagle = new Eagle("N4", 45, "It's a my eagle");
        Cheetah cheetah = new Cheetah("Puppy", 60, "It's my animal");
        Parrot parrot = new Parrot("westorn pistol", 30, "It's my parrot");
        Giraf giraf = new Giraf("Jordan", 30, "It's my giraf");
        animals.add(eagle);animals.add(parrot);animals.add(cheetah);animals.add(giraf);
        for(Animal animal : animals) {
            animal.show();
        }

    }
}