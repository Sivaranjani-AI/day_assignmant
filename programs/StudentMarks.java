import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        System.out.print("Enter 5 student marks: ");

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.print("Student marks: ");

        for (int i = 0; i < 5; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}