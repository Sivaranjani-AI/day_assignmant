class Human {

    void showHuman() {
        System.out.println("I am a Human");
    }
}

class Doctor extends Human {

    void showDoctor() {
        System.out.println("I am a Doctor");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Doctor d = new Doctor();

        d.showHuman();
        d.showDoctor();
    }
}