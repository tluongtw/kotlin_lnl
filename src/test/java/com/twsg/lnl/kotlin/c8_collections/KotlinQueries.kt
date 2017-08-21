package com.twsg.lnl.kotlin.c8_collections

import com.twsg.lnl.kotlin.c8_collections.common.Case
import com.twsg.lnl.kotlin.c8_collections.common.Status

/**
 * @author tonyl
 */
object KotlinQueries {

    fun findCaseById(cases: List<Case>, id: String): Case? {
        return cases.find { it.id == id }
    }

    fun findOpenCasesByReporter(cases: List<Case>, reporter: String): List<Case> {
        return cases
                .filter { it.reporter == reporter }
                .filter { it.status == Status.OPEN }
    }

    fun groupCaseByStatus(cases: List<Case>): Map<Status, List<Case>> {
        return cases.groupBy { it.status }
    }

    fun countCaseByReporter(cases: List<Case>): Map<String, Int> {
        return cases
                .groupingBy { it.reporter }
                .eachCount()
    }

}