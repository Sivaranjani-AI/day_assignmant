import java.util.Scanner;

public class Task6 {

    static int divide() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        return a / b;
    }

    public static void main(String[] args) {
        int result = divide();
        System.out.println("Quotient = " + result);
    }
}