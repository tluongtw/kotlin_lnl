package com.twsg.lnl.kotlin.util

/**
 * @author tonyl
 */

fun printStackTrace() {
    Thread.currentThread().stackTrace
            .drop(2)
            .forEach {
                println(it)
            }
}