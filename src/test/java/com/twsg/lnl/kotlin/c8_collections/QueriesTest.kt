package com.twsg.lnl.kotlin.c8_collections

import com.twsg.lnl.kotlin.c8_collections.common.*
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * @author tonyl
 */

class QueriesTest {

    @Test
    fun `test findCaseById`() {
        val case = case_M002
        val id = case.id

        assertEquals(case, JavaQueries.findCaseById(cases, id).get())
        assertEquals(case, KotlinQueries.findCaseById(cases, id))
    }

    @Test
    fun `test findOpenCasesByReporter`() {
        val reporter = "Daniel"

        assertEquals(listOf(case_M001, case_M006), JavaQueries.findOpenCasesByReporter(cases, reporter))
        assertEquals(listOf(case_M001, case_M006), KotlinQueries.findOpenCasesByReporter(cases, reporter))
    }

    @Test
    fun `test groupCaseByStatus`() {
        val expected = mapOf(
                Status.OPEN to listOf(case_M001, case_M003, case_M006),
                Status.CLOSED to listOf(case_M002, case_M005),
                Status.IN_PROGRESS to listOf(case_M004)
        )

        assertEquals(expected, JavaQueries.groupCaseByStatus(cases))
        assertEquals(expected, KotlinQueries.groupCaseByStatus(cases))
    }

    @Test
    fun `test countCaseByReporter`() {
        val expected = mapOf(
                "Daniel" to 3,
                "Tony" to 2,
                "Peter" to 1
        )

        assertEquals(expected, JavaQueries.countCaseByReporter(cases))
        assertEquals(expected, KotlinQueries.countCaseByReporter(cases))
    }
}