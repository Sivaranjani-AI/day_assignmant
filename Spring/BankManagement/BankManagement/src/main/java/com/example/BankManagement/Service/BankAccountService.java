package com.example.BankManagement.Service;

import com.example.BankManagement.Entity.BankAccount;
import com.example.BankManagement.Repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BankAccountService {

    @Autowired
    private BankAccountRepository bankAccountRepository;

    public BankAccount createAccount(BankAccount bankAccount) {
        return bankAccountRepository.save(bankAccount);
    }

    public String deposit(int accountId, double amount) {
         BankAccount bankAccount = bankAccountRepository.findById(accountId).orElse(null);
         if (bankAccount != null) {
             bankAccount.setBalance(bankAccount.getBalance() + amount);
             bankAccountRepository.save(bankAccount);
             return "Amount Deposited";
         }
         return "Account Not Found";
    }

    public String withdraw(int accountId, double amount) {
        BankAccount bankAccount = bankAccountRepository.findById(accountId).orElse(null);
        if (bankAccount != null) {
            if (bankAccount.getBalance()>= amount){
                bankAccount.setBalance(bankAccount.getBalance() - amount);
                bankAccountRepository.save(bankAccount);
                return "Amount Withdrawn";
            }
            return "Insufficient Balance";
        }
       return "Account Not Found";
    }

    public double checkBalance(int accountId) {
        BankAccount bankAccount = bankAccountRepository.findById(accountId).orElse(null);
        if (bankAccount != null) {
            return bankAccount.getBalance();
        }
        return 0;
    }

    public List<BankAccount> getAllAccounts() {
        return bankAccountRepository.findAll();
    }
}
