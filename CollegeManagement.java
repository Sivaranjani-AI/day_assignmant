interface Student{
    void studentName();
}
class College{
    void collegeName(){
        System.out.println("VS College");
    }
}
class Details extends College implements Student {
    public void studentName(){
        System.out.println("Student Name:Vishwa");
    }
}
public class CollegeManagement {
    public static void main(String[] args){
        Details d = new Details();
        d.collegeName();
        d.studentName();
    }
}