import java.util.Scanner;

abstract class Animal {
    abstract void sound();
    void eat(){
        System.out.println("All animal can eat");
    }
}

class Dog extends Animal{
    private String name;
    private int age;
    private String breed;
    private String owner;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    public String getOwner(){
        return owner;
    }
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    private String name;
    private int age;
    private String breed;
    private String owner;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    public String getOwner(){
        return owner;
    }
    void sound() {
        System.out.println("Cat says: meow meow!");
    }
}
public class AnimalDemo {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         System.out.println("Pet Adoption");
         System.out.println("1.Adope a dog ! ");
         System.out.println("2.Adope a cat ! ");

         System.out.print("Enter your choice : ");
         int choice = sc.nextInt();
         sc.nextLine();
         
         if ( choice == 1 ){
              Dog d = new Dog();
              
              System.out.print("Enter Name : ");
              d.setName(sc.nextLine());

              System.out.print("Enter Age : ");
              d.setAge(sc.nextInt());
              sc.nextLine();

              System.out.print("Enter Breed : ");
              d.setBreed(sc.nextLine());

              System.out.print("Enter Adopter Name : ");
              d.setOwner(sc.nextLine());              
     
              System.out.println("Pet Type  : Dog");
              System.out.println("Name      : " + d.getName());
              System.out.println("Age       : " + d.getAge());
              System.out.println("Breed     : " + d.getBreed());
              System.out.println("Adopter   : " + d.getOwner());
              if(d.getAge()<2)
                  System.out.println("Category : Puppy");
              else
                  System.out.println("Category : Adult Dog");
              
              System.out.println("Successfully Adopted!");
              System.out.println(" Pet Activities ");
              d.eat();
              d.sound();
          }
          else if ( choice == 2 ){
              Cat c = new Cat();
              
              System.out.print("Enter Name : ");
              c.setName(sc.nextLine());

              System.out.print("Enter Age : ");
              c.setAge(sc.nextInt());
              sc.nextLine();

              System.out.print("Enter Breed : ");
              c.setBreed(sc.nextLine());

              System.out.print("Enter Adopter Name : ");
              c.setOwner(sc.nextLine());              
     
              System.out.println("Pet Type : Cat");
              System.out.println("Name : " + c.getName());
              System.out.println("Age : " + c.getAge());
              System.out.println("Breed : " + c.getBreed());
              System.out.println("Adopter : " + c.getOwner());
              if(c.getAge()<2)
                  System.out.println("Category : Kitten");
              else
                  System.out.println("Category : Adult Cat");
              
              System.out.println("Successfully Adopted!");
              System.out.println(" Pet Activities ");
              c.eat();
              c.sound();
          }
          else {
              System.out.println("Invalid choice!");
          }
          System.out.println("Thank you for adopting a pet!");
    }
}





