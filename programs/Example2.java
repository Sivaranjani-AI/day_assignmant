class Vehicle {
    void drive() {
        System.out.println("All vehicle can drive");
    }
}
class Car extends Vehicle1 {
    void start() {
        System.out.println("Car is starting");
    }
}
class Bike extends Vehicle1 {
    void ride() {
        System.out.println("Bike is riding");
    }
}
public class Example2 {
    public static void main(String [] args) {
        Car c=new Car();
        Bike b=new Bike();
        c.drive();
        c.start();
        b.drive();
        b.ride();
    } 
}