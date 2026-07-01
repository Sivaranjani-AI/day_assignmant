class Bird {
    void sound(){
        System.out.println("Bird makes sound");
    }
}

class Parrot extends Bird {
    void sound(){
        super.sound();
        System.out.println("Parrot talks");
    }
}

public class SuperMethodDemo {
    public static void main(String[] args) {
        Parrot p = new Parrot();
        p.sound();
    }
}