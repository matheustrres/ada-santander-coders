package main;

import java.math.BigDecimal;

public class CheckingAccountTransactionsJarAdapter {
    private final CheckingAccountTransactionsJar checkingAccountTransactionsJar;

    public CheckingAccountTransactionsJarAdapter(CheckingAccountTransactionsJar checkingAccountTransactionsJar) {
        this.checkingAccountTransactionsJar = checkingAccountTransactionsJar;
    }

    public void withdraw(BigDecimal amount) {
        if (this.checkingAccountTransactionsJar.validateBalance(amount)) {
            this.checkingAccountTransactionsJar.withdraw(amount);
        } else {
            throw new IllegalArgumentException("Amount to withdraw not allowed.");
        }


        System.out.println("Withdrawing " + amount);
    }

    public void deposit(BigDecimal amount) {
        this.checkingAccountTransactionsJar.deposit(amount);
    }
}
