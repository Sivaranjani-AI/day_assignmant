class College {
    College(String name){
        System.out.println("College: " + name);
    }
}

class Student extends College {
    Student(){
        super("ABC College");
        System.out.println("Student constructor");
    }
}

public class SuperConstructorDemo {
    public static void main(String[] args) {
        Student s = new Student();
    }
}