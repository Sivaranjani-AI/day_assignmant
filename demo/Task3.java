import java.util.Scanner;

public class Task3 {

    static void addNumbers() {
        Scanner sc = new Scanner(System.in);

        System.out.print("First number: ");
        int a = sc.nextInt();

        System.out.print("Second number: ");
        int b = sc.nextInt();
        
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        addNumbers();
    }
}