package main;

import java.math.BigDecimal;

public class CheckingAccountTransactionsJarClientAdapter {
    private final CheckingAccountTransactionsJarAdapter checkingAccountTransactionsJarAdapter;

    public CheckingAccountTransactionsJarClientAdapter(CheckingAccountTransactionsJarAdapter checkingAccountTransactionsJarAdapter) {
        this.checkingAccountTransactionsJarAdapter = checkingAccountTransactionsJarAdapter;
    }

    public void withdraw(BigDecimal amount) {
        this.checkingAccountTransactionsJarAdapter.withdraw(amount);
    }

    public void deposit(BigDecimal amount) {
        this.checkingAccountTransactionsJarAdapter.deposit(amount);
    }
}
