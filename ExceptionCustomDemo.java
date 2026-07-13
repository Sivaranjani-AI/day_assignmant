import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class ExceptionCustomDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Enter Your Age:");
            int age = sc.nextInt();

            if (age < 18) {
                throw new InvalidAgeException("You are not eligible to vote.");
            }

            System.out.println("You are eligible to vote.");

        } catch (InvalidAgeException e) {
            System.out.println("Invalid Age!");
        }

        System.out.println("Program Ended!");
    }
}