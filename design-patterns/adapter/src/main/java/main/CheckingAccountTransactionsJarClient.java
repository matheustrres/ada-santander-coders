package main;

import java.math.BigDecimal;

public class CheckingAccountTransactionsJarClient {
    private final CheckingAccountTransactionsJar checkingAccountTransactionsJar;

    public CheckingAccountTransactionsJarClient(CheckingAccountTransactionsJar checkingAccountTransactionsJar) {
        this.checkingAccountTransactionsJar = checkingAccountTransactionsJar;
    }

    public boolean validateBalance(BigDecimal amount) {
        return this.checkingAccountTransactionsJar.validateBalance(amount);
    }

    public void withdraw(BigDecimal amount) {
        this.checkingAccountTransactionsJar.withdraw(amount);
    }

    public void deposit(BigDecimal amount) {
        this.checkingAccountTransactionsJar.deposit(amount);
    }
}
