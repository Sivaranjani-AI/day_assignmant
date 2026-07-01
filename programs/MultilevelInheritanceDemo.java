class LivingThing {

    void living() {
        System.out.println("Living Thing");
    }
}

class Animal extends LivingThing {

    void animal() {
        System.out.println("Animal");
    }
}

class Cat extends Animal {

    void cat() {
        System.out.println("Cat");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Cat c = new Cat();

        c.living();
        c.animal();
        c.cat();
    }
}