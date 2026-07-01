class Vehicle {
    String brand = "Toyota";

    Vehicle() {
        System.out.println("Vehicle Constructor");
    }

    void display() {
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle {
    String brand = "BMW";

    Car() {
        super();
        System.out.println("Car Constructor");
    }

    void show() {
        System.out.println("Child Brand: " + brand);
        System.out.println("Parent Brand: " + super.brand);

        super.display();
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.show();
    }
}