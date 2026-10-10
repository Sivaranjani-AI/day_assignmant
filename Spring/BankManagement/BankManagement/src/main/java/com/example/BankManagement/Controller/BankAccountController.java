package com.example.BankManagement.Controller;

import com.example.BankManagement.Entity.BankAccount;
import com.example.BankManagement.Service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bank")
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;

    @PostMapping("/account")
    public BankAccount createAccount(@RequestBody BankAccount bankAccount){
        return bankAccountService.createAccount(bankAccount);
    }

    @PutMapping("/deposit/{accountId}/{amount}")
    public String deposit(@PathVariable int accountId,
                          @PathVariable double amount){
        return bankAccountService.deposit(accountId,amount);
    }

    @PutMapping("/withdraw/{accountId}/{amount}")
    public String withdraw(@PathVariable int accountId,
                           @PathVariable double amount){
        return bankAccountService.withdraw(accountId,amount);
    }
    @GetMapping("/balance/{accountId}")
    public double checkBalance(@PathVariable int accountId){
        return bankAccountService.checkBalance(accountId);
    }

    @GetMapping("/accounts")
    public List<BankAccount> getAllAccounts() {
        return bankAccountService.getAllAccounts();
    }

}
