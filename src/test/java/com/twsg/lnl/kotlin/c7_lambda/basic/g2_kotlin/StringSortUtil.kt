package com.twsg.lnl.kotlin.c7_lambda.basic.g2_kotlin

import com.twsg.lnl.kotlin.c3_extensions.g2_kotlin.countVowels
import java.util.*

/**
 * @author tonyl
 */

fun sortByVowelCount(input: List<String>): List<String> {
    val comparatorByVowelCount = Comparator
            .comparingInt<String> { it.countVowels() }
            .reversed()
            .thenComparing(Comparator.naturalOrder())

    val sorted = ArrayList(input)
    sorted.sortWith(comparatorByVowelCount)

    return sorted
}
