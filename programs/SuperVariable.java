class Parent {
    int num = 100;
}

class Child extends Parent {
    int num = 200;

    void display() {
        System.out.println("Child Variable: " + num);
        System.out.println("Parent Variable: " + super.num);
    }
}

public class SuperVariable {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}