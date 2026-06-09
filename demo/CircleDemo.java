class Circle {
    double radius;

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.radius = 5;
        c1.calculateArea();
    }
}