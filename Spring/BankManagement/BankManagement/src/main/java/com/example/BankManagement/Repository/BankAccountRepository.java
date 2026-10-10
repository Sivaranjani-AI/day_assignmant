package com.example.BankManagement.Repository;

import com.example.BankManagement.Entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount,Integer> {
}
