import java.util.Scanner;

class InvalidPinException extends Exception {
    InvalidPinException(String msg) {
        super(msg);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String msg) {
        super(msg);
    }
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class ATMBalanceException extends Exception {
    ATMBalanceException(String msg) {
        super(msg);
    }
}

class MaintenanceException extends Exception {
    MaintenanceException(String msg) {
        super(msg);
    }
}

class ExcessAmountException extends Exception {
    ExcessAmountException(String msg) {
        super(msg);
    }
}

public class ATMException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        int balance = 10000;
        int atmBalance = 20000;
        boolean maintenance = false;

        try {

            System.out.print("Enter PIN: ");
            int userPin = sc.nextInt();

            if (userPin != pin) {
                throw new InvalidPinException("Wrong PIN Entered.");
            }

            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("Available Balance : " + balance);

            } else if (choice == 2) {

                if (maintenance) {
                    throw new MaintenanceException("ATM is Under Maintenance.");
                }

                System.out.print("Enter Withdrawal Amount: ");
                int amount = sc.nextInt();

                if (amount < 100 || amount % 100 != 0) {
                    throw new InvalidAmountException("Invalid Amount.");
                }

                if (amount > 10000) {
                    throw new ExcessAmountException("Withdrawal Limit Exceeded.");
                }

                if (amount > balance) {
                    throw new InsufficientBalanceException("Insufficient Account Balance.");
                }

                if (amount > atmBalance) {
                    throw new ATMBalanceException("ATM Cash Not Available.");
                }

                if (balance - amount < 500) {
                    throw new ArithmeticException("Minimum Balance of 500 Must Be Maintained.");
                }

                balance = balance - amount;
                atmBalance = atmBalance - amount;

                System.out.println("Please Collect Your Cash.");
                System.out.println("Remaining Account Balance : " + balance);

            } else {

                System.out.println("Invalid Choice.");

            }

        } catch (InvalidPinException e) {

            System.out.println(e.getMessage());

        } catch (InvalidAmountException e) {

            System.out.println(e.getMessage());

        } catch (ExcessAmountException e) {

            System.out.println(e.getMessage());

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());

        } catch (ATMBalanceException e) {

            System.out.println(e.getMessage());

        } catch (MaintenanceException e) {

            System.out.println(e.getMessage());

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());

        } finally {

            System.out.println("Thank You for Using ATM.");

        }
    }
}