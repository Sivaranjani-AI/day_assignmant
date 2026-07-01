class Animal{
    String name{
    Animal(String name){  
       this.name=name;
    }
}
class Dog extends Animal{
    String name;
    int age;
    Dog(String name,int age){
        super(name);
        this.age=age;
    }
}
public class Example3{
    public static void main(String[] args){
        Dog d=new Dog();
        System.out.println("Name:"+Tom);
        System.out.println("Age:"+4);
    }
}