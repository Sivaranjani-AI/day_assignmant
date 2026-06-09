class Mobile {
    String brand;
    double price;

    void setDetails (String b , double p) {
    brand=b;
    price=p;
    }
    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
    }
}

public class MobileDemo {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();

        m1.brand = "Redmi";
        m1.price = 15000;

        m1.display();
        System.out.println();
         
        Mobile m2 = new Mobile();

        m2.brand = "Realme";
        m2.price = 17000;

        m2.display();
        System.out.println();
        
    }
}
