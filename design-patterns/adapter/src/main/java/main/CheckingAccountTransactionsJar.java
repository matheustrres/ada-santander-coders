package main;

import java.math.BigDecimal;

public class CheckingAccountTransactionsJar {
    public boolean validateBalance(BigDecimal amount) {
        return true;
    }

    public void withdraw(BigDecimal amount) {
        System.out.println("Withdrawing " + amount);
    }

    public void deposit(BigDecimal amount) {
        System.out.println("Depositing " + amount);
    }
}
