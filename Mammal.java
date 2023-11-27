package org.example;
//
//public abstract class Mammal extends Animal implements Prey {
//    protected double runningSpeed;
//
//    public Mammal(String name, int age, double runningSpeed, String uniqueCharacteristic) {
//        super(name, age, uniqueCharacteristic);
//        this.runningSpeed = runningSpeed;
//    }
//}

abstract class Mammal extends Animal {
    int speed;


    public Mammal(String name, int age, String uniqueCharacteristic) {
        super(name, age, uniqueCharacteristic);
    }

    public Mammal() {
        super();
    }
}
