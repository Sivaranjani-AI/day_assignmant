class Shape {

    Shape() {
        System.out.println("Shape Constructor");
    }
}

class Circle extends Shape {

    Circle() {
        super();
        System.out.println("Circle Constructor");
    }
}

public class ParentConstructorDemo {
    public static void main(String[] args) {
        Circle c = new Circle();
    }
}