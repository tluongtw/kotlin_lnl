package com.twsg.lnl.kotlin.c7_lambda.inline

import com.twsg.lnl.kotlin.util.printStackTrace

/**
 * @author tonyl
 */

private fun <T> timed(execBlock: () -> T): T {
    val startTime = System.currentTimeMillis()
    try {
        return execBlock()
    } finally {
        val endTime = System.currentTimeMillis()
        val duration = endTime - startTime
        println("Execution took $duration ms")
    }
}

fun main(args: Array<String>) {
    timed {
        // within an inlined block

        println("Current stack trace: ")
        printStackTrace()

        Thread.sleep(100)
    }
}