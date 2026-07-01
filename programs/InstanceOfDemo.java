class Animal {
}

class Dog extends Animal {
}

public class InstanceOfDemo {
    public static void main(String[] args) {
        Dog obj = new Dog();

        if (obj instanceof Animal) {
            System.out.println("Dog is an instance of Animal");
        } else {
            System.out.println("Dog is not an instance of Animal");
        }
    }
}