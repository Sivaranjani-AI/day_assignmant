import java.util.Scanner;

class BankAccount {
    double balance;

    void getBalance() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }
    
    void deposit() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();

        balance += amount;
    }

    void withdraw() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Withdraw Amount: ");
        double amount = sc.nextDouble();

        balance -= amount;
    }

    void display() {
        System.out.println("Final Balance = " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.getBalance();
        b.deposit();
        b.withdraw();
        b.display();
    }
}