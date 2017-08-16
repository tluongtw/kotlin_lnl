package com.twsg.lnl.kotlin.c8_singleton.g3_kotlin

/**
 * @author tonyl
 */
object WogaaEngine {

    init {
        println("Heavy initialization")
    }

    fun analyze() {
        println("Analyzing")
    }

    @JvmStatic
    fun setupEnvironment() {
        println("Setting up environment")
    }
}
