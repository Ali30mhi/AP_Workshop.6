package org.example;
//
//public class Parrot extends Bird {
//    public Parrot(String name, int age, int flightHeight, String uniqueCharacteristic) {
//        super(name, age, flightHeight, uniqueCharacteristic);
//    }
//
//    @Override
//    public void show() {
//        System.out.println("Parrot. Name: " + name + ", Age: " + age + ", Flight Height: " + flightHeight + ", Unique Characteristic: " + uniqueCharacteristic);
//    }
//}


public class Parrot extends Bird {
    String specialFeature;
    public Parrot(String name, int flightHeight, String specialFeature){
        super();
        this.name = name;
        this.flightHeight = flightHeight;
        this.specialFeature = specialFeature;
    }

    public void show() {
        System.out.println("name:" + this.name + ", age:" + this.age + ", flight height:" + this.flightHeight + ", special feature:" + this.specialFeature);
    }
}
