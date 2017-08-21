package com.twsg.lnl.kotlin.c3_extensions.g2_kotlin

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * @author tonyl
 */
class StringUtilTest {

    @Test
    @Throws(Exception::class)
    fun testCountVowels() {
        assertEquals(3, "Jonathan".countVowels())
    }

}