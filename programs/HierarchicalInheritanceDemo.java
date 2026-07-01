class Vehicle {

    void show() {
        System.out.println("Vehicle");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is Driving");
    }
}

class Bike extends Vehicle {

    void ride() {
        System.out.println("Bike is Riding");
    }
}

class Bus extends Vehicle {

    void travel() {
        System.out.println("Bus is Travelling");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {

        Car c = new Car();
        Bike b = new Bike();
        Bus bs = new Bus();

        c.show();
        c.drive();

        b.show();
        b.ride();

        bs.show();
        bs.travel();
    }
}