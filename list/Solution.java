import java.util.ArrayList;
public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(89);
        marks.add(95);
        marks.add(78);
        marks.add(85);
        marks.add(94);

        
        System.out.println("Marks:" + marks);
        System.out.println("Element at index 2:" + marks.get(2));

        marks.remove(Integer.valueOf(78));
        System.out.println("After removing 78:" + marks);

        marks.set(1,93);
        System.out.println("After set:" + marks);
        System.out.println("Student Marks:" + marks.size());
    }
}