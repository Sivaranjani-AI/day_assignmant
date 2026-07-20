import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<String> names = new LinkedHashSet<>();

        names.add("Anu");
        names.add("Ravi");
        names.add("Priya");

        System.out.println("Names: " + names);

        names.add("Siva");
        System.out.println("After adding Siva: " + names);

        names.add("Kiran");
        System.out.println("After adding Kiran: " + names);

        names.add("Anu"); 
        System.out.println("After adding duplicate Anu: " + names);

        names.remove("Ravi");
        System.out.println("After removing Ravi: " + names);

        System.out.println("Total Names: " + names.size());
    }
}