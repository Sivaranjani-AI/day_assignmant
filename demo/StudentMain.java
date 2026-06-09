class Student {
    String name = "Rohan";
    int age = 20;
    double marks = 95;    
    void displayInfo() {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Marks:"+marks);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayInfo();
    }
}