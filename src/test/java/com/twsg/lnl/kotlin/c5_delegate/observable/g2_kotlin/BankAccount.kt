package com.twsg.lnl.kotlin.c5_delegate.observable.g2_kotlin

import kotlin.properties.Delegates.observable

/**
 * @author tonyl
 */

class BankAccount(initialBalance: Double, observer: (Double, Double) -> Unit) {

    var balance: Double by observable(initialBalance) { _, old, new ->
        observer(old, new)
    }

}