import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionDemo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Age : ");
            int age = sc.nextInt();

            System.out.println("Age = " + age );
        } catch (InputMismatchException e) {
            System.out.println("Enter the number only!");
        }
    }
}