class Employee {
    int id;
    String name;
    double salary;

    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary; 
    }
    void display(){
        System.out.println("Employee ID:" +id);
        System.out.println("Employee Name:" +name);
        System.out.println("Salary:" +salary);
    }
}
public class EmployeePayroll {
    public static void main(String[] args){
        Employee e = new Employee(107,"Yumi",45000);
        e.display();
    }
}