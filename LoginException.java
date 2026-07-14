import java.util.Scanner;

class InvalidUserException extends Exception {
    InvalidUserException(String msg) {
        super(msg);
    }
}

class UsernameTooShortException extends Exception {
    UsernameTooShortException(String msg) {
        super(msg);
    }
}

class WeakPasswordException extends Exception {
    WeakPasswordException(String msg) {
        super(msg);
    }
}

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String msg) {
        super(msg);
    }
}

class AccountLockedException extends Exception {
    AccountLockedException(String msg) {
        super(msg);
    }
}

public class LoginException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "admin123";
        int attempts = 3;

        try {

            System.out.print("Enter Username: ");
            String user = sc.nextLine();

            System.out.print("Enter Password: ");
            String pass = sc.nextLine();

            if (user.isEmpty() || pass.isEmpty()) {
                throw new NullPointerException("Username or Password cannot be empty.");
            }

            if (user.length() < 5) {
                throw new UsernameTooShortException("Username must contain at least 5 characters.");
            }

            if (!user.equals(username)) {
                throw new InvalidUserException("Invalid Username.");
            }

            if (pass.length() < 8) {
                throw new WeakPasswordException("Password must contain at least 8 characters.");
            }

            if (!pass.equals(password)) {
                attempts--;

                if (attempts == 0) {
                    throw new AccountLockedException("Account Locked! Too many failed login attempts.");
                }

                throw new InvalidPasswordException("Incorrect Password. Attempts Left: " + attempts);
            }

            System.out.println("Login Successful!");

        }

        catch (UsernameTooShortException e) {
            System.out.println(e.getMessage());
        }

        catch (InvalidUserException e) {
            System.out.println(e.getMessage());
        }

        catch (WeakPasswordException e) {
            System.out.println(e.getMessage());
        }

        catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }

        catch (AccountLockedException e) {
            System.out.println(e.getMessage());
        }

        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        finally {
            System.out.println("Program Ended successfully!");
        }
    }
}