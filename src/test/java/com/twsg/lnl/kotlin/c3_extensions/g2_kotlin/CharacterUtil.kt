package com.twsg.lnl.kotlin.c3_extensions.g2_kotlin

/**
 * @author tonyl
 */

val Char.isVowel
    get() = when (Character.toLowerCase(this)) {
        'a', 'e', 'u', 'i', 'o' -> true
        else -> false
    }
