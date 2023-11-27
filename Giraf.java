package org.example;


public class Giraf extends Mammal {
    String specialFeature;

    public Giraf(String name, int speed, String specialFeature){
        super();
        this.name = name;
        this.speed = speed;
        this.specialFeature = specialFeature;
    }


    public void show() {
        System.out.println("name:" + this.name + ", age:" + this.age + ", speed:" + this.speed + ", special feature:" + this.specialFeature);
    }
}

