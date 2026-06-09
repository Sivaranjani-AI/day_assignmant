import java.util.Scanner;

class Rectangle {
    int length, breadth;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        length = sc.nextInt();

        System.out.print("Enter Breadth: ");
        breadth = sc.nextInt();
    }

    void area() {
        System.out.println("Area = " + (length * breadth));
    }

    void perimeter() {
        System.out.println("Perimeter = " + (2 * (length + breadth)));
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.getData();
        r.area();
        r.perimeter();
    }
}