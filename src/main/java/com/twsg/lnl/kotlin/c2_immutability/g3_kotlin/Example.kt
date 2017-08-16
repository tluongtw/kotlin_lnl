package com.twsg.lnl.kotlin.c2_immutability.g3_kotlin

import java.util.*

/**
 * @author tonyl
 */

fun main(args: Array<String>) {
    val stats = PageStats("www.google.com", 1000, HashMap<String, Int>())

    val incrementedStats = stats.copy(visitCount = stats.visitCount + 2000)

    val microsoftStats = stats.copy(
            url = "www.microsoft.com",
            visitCount = stats.visitCount - 500
    )

    println(incrementedStats)
    println(microsoftStats)
}
