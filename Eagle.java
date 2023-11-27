package org.example;

//public class Eagle extends Bird implements Hunter{
//    public Eagle(String eagle, int i, int i1) {
//        super();
//
//    }
//}


//public class Eagle extends Bird {
//    private final String name;
//    private final int age;
//    private final int flightHeight;
//
//    public Eagle(String name, int age, int flightHeight) {
//        super();
//        this.name = name;
//        this.age = age;
//        this.flightHeight = flightHeight;
//    }
//
//    @Override
//    public void show() {
//        System.out.println("Eagle. Name: " + name + ", Age: " + age + ", Flight Height: " + flightHeight + ", Unique Characteristic: " + uniqueCharacteristic);
//    }
//
//    public void hunt(Prey prey) {
//        System.out.println("Eagle hunted " + prey.getName());
//    }
//}



public class Eagle extends Bird implements Hunter {
    String specialFeature;
    public Eagle(String name, int flightHeight, String specialFeature){
        this.name = name;
        this.flightHeight = flightHeight;
        this.specialFeature = specialFeature;
    }

    @Override
    public String hunt(Prey prey) {
        return "Eagle hunted " + prey.getName();
    }

    @Override
    public void show() {
        System.out.println("name:" + this.name + ", age:" + this.age + ", flight height:" + this.flightHeight + ", special feature:" + this.specialFeature);
    }
}

