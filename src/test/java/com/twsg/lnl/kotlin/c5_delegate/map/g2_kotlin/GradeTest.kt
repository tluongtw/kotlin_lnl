package com.twsg.lnl.kotlin.c5_delegate.map.g2_kotlin

import org.junit.Assert.assertEquals
import org.junit.Test
import java.lang.Double.doubleToLongBits

/**
 * @author tonyl
 */
class GradeTest {

    @Test
    fun `get grade should return value from_map`() {
        val gradeMap = mutableMapOf(
                "math" to 5.0,
                "physics" to 4.5
        )

        val grade = Grade(gradeMap)

        assertEquals(doubleToLongBits(5.0), doubleToLongBits(grade.math))
        assertEquals(doubleToLongBits(4.5), doubleToLongBits(grade.physics))
    }

    @Test
    fun `set grade should store value to map`() {
        val gradeMap = mutableMapOf<String, Double>()

        val grade = Grade(gradeMap)
        grade.math = 3.0
        grade.physics = 2.0

        assertEquals(doubleToLongBits(3.0), doubleToLongBits(gradeMap["math"]!!))
        assertEquals(doubleToLongBits(2.0), doubleToLongBits(gradeMap["physics"]!!))
    }
}