package com.twsg.lnl.kotlin.c8_singleton.g3_kotlin

/**
 * @author tonyl
 */

fun main(args: Array<String>) {
    println("Accessing class for the first time")
    WogaaEngine.setupEnvironment()

    println("Actually using the singleton instance")
    WogaaEngine.analyze()
}