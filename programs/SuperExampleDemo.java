class Mobile {

    String brand = "Samsung";

    Mobile() {
        System.out.println("Mobile Constructor");
    }

    void display() {
        System.out.println("This is a Mobile");
    }
}

class AndroidPhone extends Mobile {

    String brand = "OnePlus";

    AndroidPhone() {
        super();
        System.out.println("AndroidPhone Constructor");
    }

    void show() {
        System.out.println("Child Brand: " + brand);
        System.out.println("Parent Brand: " + super.brand);
        super.display();
    }
}

public class SuperExampleDemo {
    public static void main(String[] args) {
        AndroidPhone a = new AndroidPhone();
        a.show();
    }
}