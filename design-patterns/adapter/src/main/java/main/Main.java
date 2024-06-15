package main;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        CheckingAccountTransactionsJar checkingAccountTransactionsJar = new CheckingAccountTransactionsJar();
        CheckingAccountTransactionsJarAdapter checkingAccountTransactionsJarAdapter = new CheckingAccountTransactionsJarAdapter(checkingAccountTransactionsJar);
        CheckingAccountTransactionsJarClientAdapter checkingAccountTransactionsJarClient = new CheckingAccountTransactionsJarClientAdapter(checkingAccountTransactionsJarAdapter);

        checkingAccountTransactionsJarClient.withdraw(new BigDecimal(10000));
        checkingAccountTransactionsJarClient.deposit(new BigDecimal(100000));
    }
}