package com.twsg.lnl.kotlin.c7_lambda.basic.g2_kotlin

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * @author tonyl
 */
class StringSortUtilTest {

    @Test
    fun `test sortByConsonantCount`() {
        val names = listOf(
                "Henry",
                "Chenshu",
                "David",
                "Albert",
                "Yan Ling",
                "Daniel",
                "Tony"
        )

        val sorted = listOf(
                "Daniel",
                "Albert",
                "Chenshu",
                "David",
                "Yan Ling",
                "Henry",
                "Tony"
        )

        assertEquals(sorted, sortByVowelCount(names))
    }

}