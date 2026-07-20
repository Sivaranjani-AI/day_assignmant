import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Roshan");
        names.add("Yumi");
        names.add("Aravind");
        names.add("Rahul");
        names.add("Anu");


        System.out.println("Names: " + names);

        names.addFirst("Siva");
        System.out.println("After addFirst: " + names);

        names.addLast("Kiran");
        System.out.println("After addLast: " + names);

        System.out.println("First Element: " + names.getFirst());
        System.out.println("Last Element: " + names.getLast());

        names.removeFirst();
        System.out.println("After removeFirst: " + names);

        names.removeLast();
        System.out.println("After removeLast: " + names);

        System.out.println("Total Names: " + names.size());
    }
}