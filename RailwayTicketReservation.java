import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidTrainException extends Exception {
    public InvalidTrainException(String msg) {
        super(msg);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

class TicketLimitException extends Exception {
    public TicketLimitException(String msg) {
        super(msg);
    }
}

class EmptyNameException extends Exception {
    public EmptyNameException(String msg) {
        super(msg);
    }
}

class NegativeTicketException extends Exception {
    public NegativeTicketException(String msg) {
        super(msg);
    }
}

public class RailwayTicketReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Passenger Name: ");
            String name = sc.nextLine();
            if (name == null || name.trim().isEmpty()) {
                throw new EmptyNameException("Passenger name cannot be empty!");
            }

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            if (age < 5) {
                throw new InvalidAgeException("Age must be at least 5 years!");
            }

            System.out.print("Enter Train Number (1001 or 1002): ");
            int trainNo = sc.nextInt();
            if (trainNo != 1001 && trainNo != 1002) {
                throw new InvalidTrainException("Invalid Train Number!");
            }

            System.out.print("Enter Number of Tickets: ");
            int tickets = sc.nextInt();
            if (tickets < 0) {
                throw new NegativeTicketException("Ticket count cannot be negative!");
            }
            if (tickets > 6) {
                throw new TicketLimitException("Maximum 6 tickets allowed per booking!");
            }

            System.out.println("\nBooking Successful!");
            System.out.println("Passenger: " + name);
            System.out.println("Age: " + age);
            System.out.println("Train Number: " + trainNo);
            System.out.println("Tickets Booked: " + tickets);

        } catch (InvalidTrainException | InvalidAgeException | TicketLimitException |
                 EmptyNameException | NegativeTicketException e) {
            System.out.println("Booking Failed: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input type! Please enter numbers where required.");
        } catch (NullPointerException e) {
            System.out.println("Unexpected null value encountered!");
        } finally {
            System.out.println("Ticket booked successfully!");
        }
    }
}
