package org.example;

//public abstract class Bird extends Animal implements Prey {
//    protected int flightHeight;
//
//    public Bird(String name, int age, int flightHeight, String uniqueCharacteristic) {
//        super(name, age, uniqueCharacteristic);
//        this.flightHeight = flightHeight;
//    }
//
//    public Bird() {
//        super();
//    }
//}


abstract class Bird extends Animal{
    int flightHeight;

    public Bird(String name, int age, String uniqueCharacteristic) {
        super(name, age, uniqueCharacteristic);
    }

    public Bird() {

    }
}
