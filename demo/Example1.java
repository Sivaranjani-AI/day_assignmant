class Student {
    String name = "Ravi";
    int age = 20;
    
    void displayInfo() {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}

public class Example1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayInfo();
    }
}