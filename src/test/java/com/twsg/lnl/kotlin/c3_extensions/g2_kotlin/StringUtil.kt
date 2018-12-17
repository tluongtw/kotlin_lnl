package com.twsg.lnl.kotlin.c3_extensions.g2_kotlin

/**
 * @author tonyl
 */

/* extension method */

fun String.countVowels(): Int {
    return this.asSequence()
            .filter(Char::isVowel)
            .count()
}
