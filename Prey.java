package org.example;//package org.example;
//
//public interface Prey {
//    String getName();
//}
//
//public abstract class Bird extends Animal implements Prey {
//    protected int flightHeight;
//
//    public Bird(String name, int age, int flightHeight, String uniqueCharacteristic) {
//        super(name, age, uniqueCharacteristic);
//        this.flightHeight = flightHeight;
//    }
//}
//


public interface Prey {
    abstract String getName();
}
