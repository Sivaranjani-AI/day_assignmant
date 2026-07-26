import java.util.*;
public class MapExample {
    public static void main(String[] args) {
        Map<Integer , String> students = new HashMap<>();

        students.put(1, "John");
        students.put(2, "Alice");
        students.put(3, "Bob");
        students.put(2, "David");

        System.out.println(students);
    }
}