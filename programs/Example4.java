class Animal{
    Animal(String name){
        System.out.println("Animal name:"+name);
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name);
        Systrm.out.println("Dog constructor called");
    }
}
public class Example4{
    public static void main(String[] args){
        Dog d=new Dog("Bruno");
    }
}
