package com.twsg.lnl.kotlin.c5_delegate.observable.g1_java;

import org.junit.Test;

import java.util.function.BiConsumer;

import static org.mockito.Mockito.*;

/**
 * @author tonyl
 */
public class BankAccountTest {

    @Test
    public void setBalance_should_notify_observer() throws Exception {
        BiConsumer<Double, Double> observer = mock(BiConsumer.class);

        BankAccount account = new BankAccount(0, observer);
        account.setBalance(5D);

        verify(observer, atLeast(1)).accept(0D, 5D);
    }

}