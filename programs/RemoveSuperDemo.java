class College {
    College(String name){
        System.out.println("College: " + name);
    }
}

class Student extends College {
    Student(){
        System.out.println("Student constructor");
    }
}

public class RemoveSuperDemo {
    public static void main(String[] args) {
        Student s = new Student();
    }
}