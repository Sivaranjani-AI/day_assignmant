import java.util.Scanner;
class Employee {
    String name;
    int age;
    int salary;   
    
    void getData(){
       Scanner sc = new Scanner(System.in);
     
       System.out.print("Enter a name:");
       name = sc.nextLine();

       System.out.print("Enter an age:");
       age = sc.nextInt();

       System.out.print("Enter the salary:");
       salary = sc.nextInt();
    }

    void display() {
       System.out.println("Name:"+name);
       System.out.println("Age:"+age);
       System.out.println("Salary:"+salary);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.getData();
        e.display();
    }
}