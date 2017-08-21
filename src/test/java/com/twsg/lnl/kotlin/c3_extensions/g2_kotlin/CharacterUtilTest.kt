package com.twsg.lnl.kotlin.c3_extensions.g2_kotlin

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

/**
 * @author tonyl
 */
@RunWith(Parameterized::class)
class CharacterUtilTest(val testChar: Char, val expectedVowel: Boolean) {

    @Test
    fun isVowel() {
        assertEquals(expectedVowel, testChar.isVowel)
    }

    companion object {

        @Parameters
        @JvmStatic
        fun params(): List<Array<Any>> {
            return listOf(
                    arrayOf('A', true),
                    arrayOf('a', true),
                    arrayOf('E', true),
                    arrayOf('e', true),
                    arrayOf('U', true),
                    arrayOf('u', true),
                    arrayOf('I', true),
                    arrayOf('i', true),
                    arrayOf('O', true),
                    arrayOf('o', true),
                    arrayOf('B', false),
                    arrayOf('c', false),
                    arrayOf('D', false)
            )
        }
    }

}