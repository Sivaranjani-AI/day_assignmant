class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound();
        System.out.println("Dog barks");
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
    }
}