package org.example;//package org.example;
//
//public interface Hunter {
//    void hunt(Prey prey);
//}
//
//public class Sparrow extends Bird {
//    public Sparrow(String name, int age, int flightHeight, String uniqueCharacteristic){
//        super(name, age, flightHeight, uniqueCharacteristic);
//    }
//
//    @Override
//    public void show() {
//        String flightHeight = null;
//        System.out.println("Sparrow. Name: " + name + ", Age: " + age + ", Flight Height: " + flightHeight + ", Unique Characteristic: " + uniqueCharacteristic);
//    }
//}
//
////public class Eagle extends Bird implements Hunter {
////    public Eagle(String name, int age, int flightHeight, String uniqueCharacteristic){
////        super(name, age, flightHeight, uniqueCharacteristic);
////    }
//
//    @Override
//    public void hunt(Prey prey) {
//        System.out.println(this.name + " hunted " + prey.getName());
//    }
//
////    @Override
////    public void show() {
////        String flightHeight = null;
////        System.out.println("Eagle. Name: " + name + ", Age: " + age + ", Flight Height: " + flightHeight + ", Unique Characteristic: " + uniqueCharacteristic);
////    }
////}
//
//public class Deer extends Mammal {
//    public Deer(String name, int age, double runningSpeed, String uniqueCharacteristic){
//        super(name, age, runningSpeed, uniqueCharacteristic);
//    }
//
//    @Override
//    public void show() {
//        System.out.println("Deer. Name: " + name + ", Age: " + age + ", Running Speed: " + runningSpeed + ", Unique Characteristic: " + uniqueCharacteristic);
//    }
//}



interface Hunter {
    abstract String hunt(Prey prey);

}
