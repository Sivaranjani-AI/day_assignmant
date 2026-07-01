class Bank{
    String bankName;
   
    Bank(String bankName){
       this.bankName = bankName;   
    }
}
class Account extends Bank {
    Account(String bankName){
        super(bankName);
    }
    void display(){
        System.out.println("Bank Name:" +bankName);
    }
}
public class BankingApplication {
    public static void main(String[] args){
        Account a = new Account("SBI");
        a.display();
    }
}