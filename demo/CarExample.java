class Car {
    String brand;
    String model;
    int price;

    void displayInfo() {
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Price:"+price);
    }
}

public class CarExample {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Ford"; 
        c1.model = "F-150";
        c1.price = 400000;   
        
        Car c2 = new Car();
        c2.brand = "Toyota";
        c2.model = "RAV4";
        c2.price = 2000000;

        c1.displayInfo();
        System.out.println();
        
        c2.displayInfo();
    }
}