class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    void areaCircle() {
        System.out.println("Area of Circle");
    }
}

class Rectangle extends Shape {
    void areaRectangle() {
        System.out.println("Area of Rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.areaCircle();

        Rectangle r = new Rectangle();
        r.draw();
        r.areaRectangle();
    }
}