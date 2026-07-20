import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(87);
        numbers.add(92);
        numbers.add(85);
        numbers.add(95);        

        System.out.println("Numbers: " + numbers);

        numbers.add(89);
        System.out.println("After adding 89: " + numbers);

        numbers.add(94);
        System.out.println("After adding 94: " + numbers);

        numbers.add(87); 
        System.out.println("After adding duplicate 87: " + numbers);

        numbers.remove(95);
        System.out.println("After removing 95: " + numbers);

        System.out.println("Total Numbers: " + numbers.size());
    }
}