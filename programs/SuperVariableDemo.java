class Fruit {
    String name = "Fruit";
}

class Apple extends Fruit {
    String name = "Apple";

    void display() {
        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name);
    }
}

public class SuperVariableDemo {
    public static void main(String[] args) {
        Apple a = new Apple();
        a.display();
    }
}