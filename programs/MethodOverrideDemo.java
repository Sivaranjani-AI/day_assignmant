class Bank {

    void details() {
        System.out.println("Bank Details");
    }
}

class SBI extends Bank {

    void details() {
        super.details();
        System.out.println("SBI Details");
    }
}

public class MethodOverrideDemo {
    public static void main(String[] args) {
        SBI s = new SBI();
        s.details();
    }
}