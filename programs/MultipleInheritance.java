interface Father {
    void show();
}
interface Mother {
    void display();
}
class Child implements Father,Mother {
    public void show(){
        System.out.println("Father's Property");
    }
    public void display(){
        System.out.println("Mother's Property");
    }
}
public class MultipleInheritance{
    public static void main9String[] args){
        C obj=new C ();
        obj.show();
        obj.display();
    }
}