package com.twsg.lnl.kotlin.c5_delegate.observable.g1_java;

import java.util.function.BiConsumer;

/**
 * @author tonyl
 */
public class BankAccount {

    private final Observable<Double> balance;

    public BankAccount(double balance, BiConsumer<Double, Double> balanceObserver) {
        this.balance = new Observable<>(balance, balanceObserver);
    }

    public double getBalance() {
        return this.balance.get();
    }

    public void setBalance(double balance) {
        this.balance.set(balance);
    }
}
