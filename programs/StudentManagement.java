class Student {
    int id;
    String name;

    Student(int id,String name){
        this.id=id;
        this.name=name; 
    }
    void display(){
        System.out.println("Student ID:" +id);
        System.out.println("Student Name:" +name);
    }
}
public class StudentManagement {
    public static void main(String[] args){
        Student s = new Student(107,"Yumi");
        s.display();
    }
}