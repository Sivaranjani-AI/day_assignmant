class Laptop {
    String brand;
    int ram;
    double price;

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Ram: " + ram + "GB");
        System.out.println("Price : " + price);
    }
}

public class LaptopDemo {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();

        l1.brand = "HP";
        l1.ram = 8;
        l1.price = 45000;

        l1.display();
    }
}