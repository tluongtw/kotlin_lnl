package com.twsg.lnl.kotlin.c3_extensions.g2_kotlin

/**
 * @author tonyl
 */

fun String.countVowels(): Int {
    return this.asSequence()
            .filter { it.isVowel }
            .count()
}
