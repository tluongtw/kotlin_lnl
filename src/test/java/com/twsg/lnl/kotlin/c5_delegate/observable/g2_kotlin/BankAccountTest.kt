package com.twsg.lnl.kotlin.c5_delegate.observable.g2_kotlin

import org.junit.Test
import org.mockito.Mockito.*

/**
 * @author tonyl
 */
class BankAccountTest {

    @Test
    fun setBalance_should_notify_observer() {
        abstract class Func : ((Double, Double) -> Unit)

        val observer: (Double, Double) -> Unit = mock(Func::class.java)

        val account = BankAccount(0.0, observer)
        account.balance = 5.0

        verify(observer, atLeast(1)).invoke(0.0, 5.0)
    }

}