package org.example;

public class Cheetah extends Mammal implements Hunter {
    String specialFeature;
    public Cheetah(String name, int speed, String specialFeature){
        this.name = name;
        this.speed = speed;
        this.specialFeature = specialFeature;
    }
    @Override
    public String hunt(Prey prey) {
        return "Cheetah hunted " + prey.getName();  // assuming getName() method exists in Prey interface
    }

    public void show() {
        System.out.println("name:" + this.name + ", age:" + this.age + ", speed:" + this.speed + ", special feature:" + this.specialFeature);
    }
}



