class Bank {
    void bankName() {
        System.out.println("SBI Bank");
    }
}

class ATM extends Bank{
    void withdraw() {
        System.out.println("Withdraw Money");
    }
}

class Customer extends Bank{
    void deposit() {
        System.out.println("Deposit Money");
    }
}

public class ATMManagement {
    public static void main(String[] args) {
        ATM a = new ATM();
        Customer c = new Customer();

        a.bankName();
        a.withdraw();

        c.bankName();
        c.deposit();
    }
}