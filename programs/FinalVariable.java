class Bank {
    final double INTEREST_RATE = 7.5;

    void display() {
        System.out.println("Interest Rate = " + INTEREST_RATE + "%");
    }
}

public class FinalVariable {
    public static void main(String[] args) {
        Bank obj = new Bank();
        obj.display();
    }
}